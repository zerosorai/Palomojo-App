package mgks.os.webview;



class SmartWebView {

	//Permission variables
	static boolean ASWP_JSCRIPT     = true;     //enable JavaScript for webview
	static boolean ASWP_FUPLOAD     = true;     //upload file from webview
	static boolean ASWP_CAMUPLOAD   = true;     //enable upload from camera for photos
 	static boolean ASWP_MULFILE     = false;    //upload multiple files in webview
	static boolean ASWP_LOCATION    = true;     //track GPS locations
	static boolean ASWP_RATINGS     = true;     //show ratings dialog; auto configured, edit method get_rating() for customizations
	static boolean ASWP_PBAR        = true;     //show progress bar in app
	static boolean ASWP_ZOOM        = false;    //zoom control for webpages view
	static boolean ASWP_SFORM       = false;    //save form cache and auto-fill information
	static boolean ASWP_OFFLINE     = false;    //whether the loading webpages are offline or online
	static boolean ASWP_EXTURL      = false;     //open external url with default browser instead of app webview

	//Configuration variables
	static String ASWV_URL          = "http://sorai.tk/Earthquake"; //complete URL of your website or webpage
	static String ASWV_F_TYPE       = "*/*";  //to upload any file type using "*/*"; check file type references for more

	//Rating system variables
	static int ASWR_DAYS            = 3;        //after how many days of usage would you like to show the dialoge
	static int ASWR_TIMES           = 10;       //overall request launch times being ignored
	static int ASWR_INTERVAL        = 2;        //reminding users to rate after days interval




}
