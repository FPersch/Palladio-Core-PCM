using System;
using System.Drawing;
using System.Collections;
using System.ComponentModel;
using System.Windows.Forms;
using System.Data;

namespace RequestClient
{
	/// <summary>
	/// GUI for a little client that creates HTTP-Get-Requests. The client runs multi-threaded to
	/// create simulataneous requests.
	/// Just for testing purposes.
	/// </summary>
	/// 
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/02/27 16:09:11  kelsaka
	/// - Added the "simultaneous http request client"
	///  (folder: SimulataneousRequestClient) for testing  the webserver with multiple
	///  parallel requests. This tools provides a simple gui to create http-requests.
	///
	/// </pre>
	/// </remarks>
	public class MainForm : System.Windows.Forms.Form
	{
		private System.Windows.Forms.MainMenu mainMenu;
		private System.Windows.Forms.Button buttonStartRequests;
		private System.Windows.Forms.GroupBox groupBoxSettings;
		private System.Windows.Forms.TextBox textBoxNumberOfRequests;
		private System.Windows.Forms.TextBox textBoxURI;
		private System.Windows.Forms.StatusBar statusBar;
		private System.Windows.Forms.TextBox textBoxLogOutput;
		private System.Windows.Forms.GroupBox groupBoxOutput;
		private System.Windows.Forms.MenuItem menuFile;
		private System.Windows.Forms.MenuItem menuFileExit;
		private System.Windows.Forms.MenuItem menuHelp;
		private System.Windows.Forms.MenuItem menuHelpAbout;
		private System.Windows.Forms.Panel StartRequestPanel;
		private System.Windows.Forms.Label labelNumberOfRequests;
		private System.Windows.Forms.Label labelRequestURI;
		private System.Windows.Forms.Label labelNumberOfLoops;
		private System.Windows.Forms.TextBox textBoxNumberOfLoops;

		private HTTPRequestGenerator requestGenerator;
		private bool requestActive;
		private System.Windows.Forms.TextBox textBoxSendDelay;
		private System.Windows.Forms.Label labelSendDelay;
		/// <summary>
		/// Erforderliche Designervariable.
		/// </summary>
		private System.ComponentModel.Container components = null;

		public MainForm()
		{
			//
			// Erforderlich f�r die Windows Form-Designerunterst�tzung
			//
			InitializeComponent();
			requestGenerator = new HTTPRequestGenerator();

			Init();

		}


		public void Init()
		{
			requestActive = false;
			this.requestGenerator.ClientMessage += new HTTPRequestGenerator.HandleRequestEvent (this.requestGenerator_ClientMessage);			
			this.WriteLogMessage("HTTP-Request-Client initiated.");
		}
		

		/// <summary>
		/// Die verwendeten Ressourcen bereinigen.
		/// </summary>
		protected override void Dispose( bool disposing )
		{
			if( disposing )
			{
				if (components != null) 
				{
					components.Dispose();
				}
			}
			base.Dispose( disposing );
		}

		#region Vom Windows Form-Designer generierter Code
		/// <summary>
		/// Erforderliche Methode f�r die Designerunterst�tzung. 
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor ge�ndert werden.
		/// </summary>
		private void InitializeComponent()
		{
			System.Resources.ResourceManager resources = new System.Resources.ResourceManager(typeof(MainForm));
			this.buttonStartRequests = new System.Windows.Forms.Button();
			this.groupBoxSettings = new System.Windows.Forms.GroupBox();
			this.textBoxNumberOfLoops = new System.Windows.Forms.TextBox();
			this.labelNumberOfLoops = new System.Windows.Forms.Label();
			this.StartRequestPanel = new System.Windows.Forms.Panel();
			this.labelNumberOfRequests = new System.Windows.Forms.Label();
			this.textBoxNumberOfRequests = new System.Windows.Forms.TextBox();
			this.textBoxURI = new System.Windows.Forms.TextBox();
			this.labelRequestURI = new System.Windows.Forms.Label();
			this.statusBar = new System.Windows.Forms.StatusBar();
			this.textBoxLogOutput = new System.Windows.Forms.TextBox();
			this.groupBoxOutput = new System.Windows.Forms.GroupBox();
			this.mainMenu = new System.Windows.Forms.MainMenu();
			this.menuFile = new System.Windows.Forms.MenuItem();
			this.menuFileExit = new System.Windows.Forms.MenuItem();
			this.menuHelp = new System.Windows.Forms.MenuItem();
			this.menuHelpAbout = new System.Windows.Forms.MenuItem();
			this.textBoxSendDelay = new System.Windows.Forms.TextBox();
			this.labelSendDelay = new System.Windows.Forms.Label();
			this.groupBoxSettings.SuspendLayout();
			this.StartRequestPanel.SuspendLayout();
			this.groupBoxOutput.SuspendLayout();
			this.SuspendLayout();
			// 
			// buttonStartRequests
			// 
			this.buttonStartRequests.Location = new System.Drawing.Point(8, 32);
			this.buttonStartRequests.Name = "buttonStartRequests";
			this.buttonStartRequests.Size = new System.Drawing.Size(112, 40);
			this.buttonStartRequests.TabIndex = 0;
			this.buttonStartRequests.Text = "Start Requests";
			this.buttonStartRequests.Click += new System.EventHandler(this.buttonStartRequests_Click);
			// 
			// groupBoxSettings
			// 
			this.groupBoxSettings.Controls.Add(this.textBoxSendDelay);
			this.groupBoxSettings.Controls.Add(this.labelSendDelay);
			this.groupBoxSettings.Controls.Add(this.textBoxNumberOfLoops);
			this.groupBoxSettings.Controls.Add(this.labelNumberOfLoops);
			this.groupBoxSettings.Controls.Add(this.StartRequestPanel);
			this.groupBoxSettings.Controls.Add(this.labelNumberOfRequests);
			this.groupBoxSettings.Controls.Add(this.textBoxNumberOfRequests);
			this.groupBoxSettings.Controls.Add(this.textBoxURI);
			this.groupBoxSettings.Controls.Add(this.labelRequestURI);
			this.groupBoxSettings.Dock = System.Windows.Forms.DockStyle.Top;
			this.groupBoxSettings.Location = new System.Drawing.Point(0, 0);
			this.groupBoxSettings.Name = "groupBoxSettings";
			this.groupBoxSettings.Size = new System.Drawing.Size(792, 128);
			this.groupBoxSettings.TabIndex = 1;
			this.groupBoxSettings.TabStop = false;
			this.groupBoxSettings.Text = "Settings";
			// 
			// textBoxNumberOfLoops
			// 
			this.textBoxNumberOfLoops.Location = new System.Drawing.Point(408, 80);
			this.textBoxNumberOfLoops.Name = "textBoxNumberOfLoops";
			this.textBoxNumberOfLoops.Size = new System.Drawing.Size(64, 20);
			this.textBoxNumberOfLoops.TabIndex = 6;
			this.textBoxNumberOfLoops.Text = "1";
			// 
			// labelNumberOfLoops
			// 
			this.labelNumberOfLoops.Location = new System.Drawing.Point(312, 80);
			this.labelNumberOfLoops.Name = "labelNumberOfLoops";
			this.labelNumberOfLoops.Size = new System.Drawing.Size(96, 16);
			this.labelNumberOfLoops.TabIndex = 5;
			this.labelNumberOfLoops.Text = "Number of loops:";
			// 
			// StartRequestPanel
			// 
			this.StartRequestPanel.Controls.Add(this.buttonStartRequests);
			this.StartRequestPanel.Dock = System.Windows.Forms.DockStyle.Right;
			this.StartRequestPanel.Location = new System.Drawing.Point(661, 16);
			this.StartRequestPanel.Name = "StartRequestPanel";
			this.StartRequestPanel.Size = new System.Drawing.Size(128, 109);
			this.StartRequestPanel.TabIndex = 4;
			// 
			// labelNumberOfRequests
			// 
			this.labelNumberOfRequests.Location = new System.Drawing.Point(8, 72);
			this.labelNumberOfRequests.Name = "labelNumberOfRequests";
			this.labelNumberOfRequests.Size = new System.Drawing.Size(112, 32);
			this.labelNumberOfRequests.TabIndex = 3;
			this.labelNumberOfRequests.Text = "Number of parallel Requests / Threads:";
			// 
			// textBoxNumberOfRequests
			// 
			this.textBoxNumberOfRequests.Location = new System.Drawing.Point(120, 80);
			this.textBoxNumberOfRequests.Name = "textBoxNumberOfRequests";
			this.textBoxNumberOfRequests.Size = new System.Drawing.Size(168, 20);
			this.textBoxNumberOfRequests.TabIndex = 2;
			this.textBoxNumberOfRequests.Text = "35";
			// 
			// textBoxURI
			// 
			this.textBoxURI.Location = new System.Drawing.Point(120, 40);
			this.textBoxURI.Name = "textBoxURI";
			this.textBoxURI.Size = new System.Drawing.Size(168, 20);
			this.textBoxURI.TabIndex = 1;
			this.textBoxURI.Text = "http://127.0.0.1:81/index.html";
			// 
			// labelRequestURI
			// 
			this.labelRequestURI.Location = new System.Drawing.Point(8, 40);
			this.labelRequestURI.Name = "labelRequestURI";
			this.labelRequestURI.Size = new System.Drawing.Size(112, 16);
			this.labelRequestURI.TabIndex = 2;
			this.labelRequestURI.Text = "Request URI:";
			// 
			// statusBar
			// 
			this.statusBar.Location = new System.Drawing.Point(0, 551);
			this.statusBar.Name = "statusBar";
			this.statusBar.Size = new System.Drawing.Size(792, 22);
			this.statusBar.TabIndex = 2;
			// 
			// textBoxLogOutput
			// 
			this.textBoxLogOutput.Dock = System.Windows.Forms.DockStyle.Fill;
			this.textBoxLogOutput.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((System.Byte)(0)));
			this.textBoxLogOutput.Location = new System.Drawing.Point(3, 16);
			this.textBoxLogOutput.Multiline = true;
			this.textBoxLogOutput.Name = "textBoxLogOutput";
			this.textBoxLogOutput.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
			this.textBoxLogOutput.Size = new System.Drawing.Size(786, 404);
			this.textBoxLogOutput.TabIndex = 3;
			this.textBoxLogOutput.Text = "";
			// 
			// groupBoxOutput
			// 
			this.groupBoxOutput.Controls.Add(this.textBoxLogOutput);
			this.groupBoxOutput.Dock = System.Windows.Forms.DockStyle.Fill;
			this.groupBoxOutput.Location = new System.Drawing.Point(0, 128);
			this.groupBoxOutput.Name = "groupBoxOutput";
			this.groupBoxOutput.Size = new System.Drawing.Size(792, 423);
			this.groupBoxOutput.TabIndex = 4;
			this.groupBoxOutput.TabStop = false;
			this.groupBoxOutput.Text = "Output";
			// 
			// mainMenu
			// 
			this.mainMenu.MenuItems.AddRange(new System.Windows.Forms.MenuItem[] {
																					 this.menuFile,
																					 this.menuHelp});
			// 
			// menuFile
			// 
			this.menuFile.Index = 0;
			this.menuFile.MenuItems.AddRange(new System.Windows.Forms.MenuItem[] {
																					 this.menuFileExit});
			this.menuFile.Text = "File";
			// 
			// menuFileExit
			// 
			this.menuFileExit.Index = 0;
			this.menuFileExit.Text = "Exit";
			this.menuFileExit.Click += new System.EventHandler(this.menuFileExit_Click);
			// 
			// menuHelp
			// 
			this.menuHelp.Index = 1;
			this.menuHelp.MenuItems.AddRange(new System.Windows.Forms.MenuItem[] {
																					 this.menuHelpAbout});
			this.menuHelp.Text = "?";
			// 
			// menuHelpAbout
			// 
			this.menuHelpAbout.Index = 0;
			this.menuHelpAbout.Text = "About";
			this.menuHelpAbout.Click += new System.EventHandler(this.menuHelpAbout_Click);
			// 
			// textBoxSendDelay
			// 
			this.textBoxSendDelay.Location = new System.Drawing.Point(412, 40);
			this.textBoxSendDelay.Name = "textBoxSendDelay";
			this.textBoxSendDelay.Size = new System.Drawing.Size(64, 20);
			this.textBoxSendDelay.TabIndex = 8;
			this.textBoxSendDelay.Text = "70";
			// 
			// labelSendDelay
			// 
			this.labelSendDelay.Location = new System.Drawing.Point(316, 40);
			this.labelSendDelay.Name = "labelSendDelay";
			this.labelSendDelay.Size = new System.Drawing.Size(96, 16);
			this.labelSendDelay.TabIndex = 7;
			this.labelSendDelay.Text = "Send Delay in ms:";
			// 
			// MainForm
			// 
			this.AutoScaleBaseSize = new System.Drawing.Size(5, 13);
			this.ClientSize = new System.Drawing.Size(792, 573);
			this.Controls.Add(this.groupBoxOutput);
			this.Controls.Add(this.statusBar);
			this.Controls.Add(this.groupBoxSettings);
			this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
			this.Menu = this.mainMenu;
			this.MinimumSize = new System.Drawing.Size(750, 320);
			this.Name = "MainForm";
			this.Text = "Simultaneous HTTP Request Client for testing purposes";
			this.groupBoxSettings.ResumeLayout(false);
			this.StartRequestPanel.ResumeLayout(false);
			this.groupBoxOutput.ResumeLayout(false);
			this.ResumeLayout(false);

		}
		#endregion

		/// <summary>
		/// Der Haupteinstiegspunkt f�r die Anwendung.
		/// </summary>
		[STAThread]
		static void Main() 
		{
			Application.Run(new MainForm());
		}


		#region General Handler Methods.
		/// <summary>
		/// Starts the requestGenerator sending requests.
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		private void buttonStartRequests_Click(object sender, System.EventArgs e)
		{
			if(!requestActive)
			{
				this.buttonStartRequests.Text = "Stop Requests";
				requestActive = true;

				try 
				{				
					requestGenerator.StartRequest(textBoxURI.Text, Int32.Parse(textBoxNumberOfRequests.Text), Int32.Parse(textBoxNumberOfLoops.Text), Int32.Parse(textBoxSendDelay.Text));
				}
				catch (FormatException ex)
				{
					WriteLogMessage("Error: Please correct the input parameters. " + ex.Message);
				}
				catch (Exception ex)
				{
					WriteLogMessage("Error: " + ex.Message);
				}
			}
			else
			{
				requestActive = false;
				this.buttonStartRequests.Text = "Start Requests";
				requestGenerator.TerminateThreads();
			}
		}

		/// <summary>
		/// Handles events from the requestGenerator.
		/// </summary>
		/// <param name="message">Message to display.</param>
		private void requestGenerator_ClientMessage(string message)
		{
			WriteLogMessage(message);
		}
		#endregion


		#region Helper Methods.
		/// <summary>
		/// Writes Loggins information to the statusbar and the log-console.
		/// </summary>
		/// <param name="message">message to write.</param>
		private void WriteLogMessage(string message)
		{
			this.textBoxLogOutput.AppendText("# " + message + Environment.NewLine);
			this.textBoxLogOutput.Refresh();
			this.statusBar.Text = message;
		}
		#endregion


		#region Menu Handler Methods.
		/// <summary>
		/// Exits the program.
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		private void menuFileExit_Click(object sender, System.EventArgs e)
		{
			this.Close();
		}

		/// <summary>
		/// Shows messagebox with some "about".
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		private void menuHelpAbout_Click(object sender, System.EventArgs e)
		{
			MessageBox.Show("Creates simultaneous HTTP-Requests to the specified URI.", "About", MessageBoxButtons.OK, MessageBoxIcon.Information);
		}
		#endregion





	}
}
