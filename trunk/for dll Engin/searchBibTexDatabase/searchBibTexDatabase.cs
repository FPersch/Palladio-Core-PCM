using System;
using System.Collections;
using System.Data;
using System.IO;
using DBAcesses;

namespace searchBibTexDatabase
{
	/// <summary>
	/// Zusammenfassung f�r Class1.
	/// </summary>
	public class seachrchDB
	{
		private Hashtable userInput;
		private bool detailsRequested = false;
		private DBAcessComponent search;

		public seachrchDB(Hashtable ui, ref DBAcessComponent db)
		{
			this.userInput = ui;
			this.search = db;
		}

		public string Result()
		{
			Hashtable searchMode = new Hashtable();
			//DBAcessComponent search = new DBAcessComponent();

			//check if Details requested:
			if (this.userInput.ContainsKey("ID"))
				this.detailsRequested = true;
			if (this.detailsRequested)
			{
				DataSet temp = this.search.SearchDirektForRows("Bibtex", this.userInput);
				ResultFormater rdf = new ResultFormater(temp);
				return rdf.FormatToBibtexEntry();
			}
			string searchOption = this.userInput["select"].ToString();

			//switch DatabaseSearchMode
			switch (searchOption)
			{
				case "nur+Autor":
					{
						if (this.userInput["author"].ToString() == "")
							return ReturnErrorMessage();
						searchMode = SearchAuthor(this.userInput);
						break;
					}
				case "nur+Titel":
					if (this.userInput["title"].ToString() == "")
						return ReturnErrorMessage();
					searchMode = SearchTitle(this.userInput);
					break;
				case "beides":
					if (this.userInput["author"].ToString() == "" || this.userInput["title"].ToString() == "")
						return ReturnErrorMessage();
					searchMode = SearchBoth(this.userInput);
					break;
				default:
					throw new Exception("Unable to find the right Userselection");


			}
//			}

			//search Database

			DataSet searchResult = this.search.SearchForRows("Bibtex", searchMode);

			ResultFormater rsf = new ResultFormater(searchResult);

			string resultAsString = rsf.FormatToString();

//			string bibtexResult = FormatToBibTexString(searchResult);
			return resultAsString;
		}

		internal string ReturnErrorMessage()
		{
			//return an errormessage
			StreamReader errorMessageReader = new StreamReader(@"..\..\..\for dll Engin\searchBibTexDatabase\errorMessage.txt");
			string message = errorMessageReader.ReadToEnd();
			errorMessageReader.Close();
			return message;

		}

		internal Hashtable SearchBoth(Hashtable ui)
		{
			ui.Remove("select");
			return ui;
		}

		internal Hashtable SearchTitle(Hashtable ui)
		{
			ui.Remove("select");
			ui.Remove("autor");
			return ui;
		}

		internal Hashtable SearchAuthor(Hashtable ui)
		{
			ui.Remove("select");
			ui.Remove("title");
			return ui;
		}
	}
}