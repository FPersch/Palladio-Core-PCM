using System;
using System.Collections;
using MySmallWebServer.MyServerException;
using dictionary;
using System.IO;


namespace MySmallWebServer.ExternalApplication
{
	/// <summary>
	/// Zusammenfassung f�r DictionaryApplication.
	/// </summary>
	public class DictionaryApplication : IFormApplication
	{
		string word;
		dictionarySearcher search;
		IList result;

		public DictionaryApplication(Hashtable input)
		{
			this.search = new dictionary.dictionarySearcher();
			this.word = input["textfield"].ToString();
			try
			{
				this.result= this.search.searchForWord(this.word);

			}
			catch(Exception e)
			{
				Console.WriteLine(e.Message);
				throw new ApplicationException("Dictionary did not work");
			}
			if(this.result.Count == 0)
				Console.WriteLine("nichst drin");
		}


		public string GenerateText()
		{

			Console.WriteLine("suche Entsprechungen "+this.resultTable());
			Console.WriteLine("versuche Datei zu �ffnen");
			StreamReader baseFile = new StreamReader("default-webPage.txt");
			string baseDoc = baseFile.ReadToEnd();
			
			string replayString =""; 
			replayString = replayString +"<H2>gefundene Entsprechungen zum Wort: "+ this.word +"</H2> \n\r";
			replayString = replayString +this.resultTable();
			replayString = replayString +"<a href=\"dic.htm\"> neue Suche </a>";

			baseDoc = baseDoc.Replace("#######################################",replayString);
			return baseDoc;
			
			
		}

		protected string resultTable()
		{
			string result ="";
			foreach(string s in this.result)
				result = result+" "+s+"<br>";
			return result;
		}
	}
}
