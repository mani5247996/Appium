package SampleCI;

public interface PageElement {

	public final static String XPATH_IAGREE_BUTTON = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public final static String XPATH_ENTER_BUTTON = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
	public final static String XPATH_ENTERING_MOBILE_NUMBER = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.widget.EditText[1]";
	public final static String XPATH_TAPPING_ON_PASSWORD_BUTTON = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.EditText[1]";
	public final static String XPATH_ENTERING_PASSWORD = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.EditText[1]";
	public final static String XPATH_TAPPING_ON_COUNTRY_CODE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]/android.widget.Button[1]";
	public final static String SELECTING_INDIA_FROM_LIST = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[6]";
	public final static String TAPPING_ON_LOGIN_BUTTON = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]";
	public final static String TAPPING_ON_CANCEL_BUTTON = "com.assured.singtel.release:id/buttonDefaultNegative";
	///com.test.assured:id/buttonDefaultNegative
	// navigate camera
	public final static String TAPPING_ON_MENU = "com.assured.singtel.release:id/navigation_icon";

	// Tapping on user option
	public final static String TAPPING_ON_CAMERA_OPTION = "com.test.assured:id/user_icon";
	
	public final static String country_code_sec_dev="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]";
	// Tapping on profile_phone
	public final static String TAPPING_PROFILE_OPTION = "com.test.assured:id/profile_photo";
	// Tapping on take new photo option
	public final static String TAPPING_NEW_PHOTO = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
	// Taking newing photo
	public final static String NEW_PHOTO = "com.android.camera:id/shutter_button";
	// Select option from camera
	public final static String SELECT_OPTION = "com.android.camera:id/btn_done";
	// Selecting save option
	public final static String SAVE_OPTION = "com.test.assured:id/second_action_text";
	// confirmation text for updating the profile pic
	public final static String confirmation_text = "com.test.assured:id/text";
	// Edit username
	public final static String EDIT_USERNAME = "com.test.assured:id/edit_my_account_name";
	// Privacy mode on
	public final static String PRIVACY_MODE_ON = "com.test.assured:id/incognito_mode_switch";
	// selecting the map mode
	public final static String MAP_MODE_OPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RadioButton[1]";
	// tapping on choose button
	public final static String CHOOSE_OPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]";
	// verify the mode
	public final static String MAP_MODE_TEXT = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[5]/android.widget.TextView[2]";
	// Selecting the satelite mode
	public final static String SATELITE_MODE_OPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.RadioButton[1]";
	// Selecting Hybird mode
	public final static String HYBIRD_MODE_OPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.RadioButton[1]";
	public final static String agree_btn_sec_dev = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]";

	// log out option
	public final static String LOG_OUT_OPTION = "com.test.assured:id/settings_text";
	// Tapping on log out option
	public final static String TAPPING_ON_LOG_OUT_OPTION = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[2]";
	// MI OPTION
	public final static String MI_OPTION_IN_DISTANCE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RadioButton[1]";

	// km OPTION
	public final static String UI_OPTION_IN_DISTANCE = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.RadioButton[1]";

	// Distance text
	public final static String UNITS_DETAILS_IN_TEXT = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[6]/android.widget.TextView[2]";
	// Register Singtel OnePass
	public final static String Register_singtel = "//android.view.View[@content-desc='Register Singtel OnePass']";
	// ENTERING Mobile number
	public final static String MOBILE_NUMBER = "//android.widget.EditText[@content-desc='Mobile number']";
	// ENTERING password
	public final static String ENTERING_PASSWORD = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[1]";
	// ENTERING CONFIRM password
	public final static String ENTERING_CONFIRM_PASSWORD = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[2]";
	// TAPPING ON SUBMIT BUT
	public final static String TAPPING_ON_SUMBIT_BUTTON = "//android.view.View[@content-desc='Submit']";
	// ERROR MSG
	public final static String ERROR_MSG = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]";
	// Forgot password
	public final static String forgot_password = "//android.view.View[@content-desc='Forgot password']";
	// SUBMIT BUTTON
	public final static String SUBMIT_BTN = "//android.view.View[@content-desc='Submit']";
	// Security answer
	public final static String ENTER_ANSWER = "//android.widget.EditText[@content-desc='Enter answer here']";
	// Tapping on next
	public final static String TAPPING_ON_NEXT = "//android.view.View[@content-desc='Next']";
	// Selecting the country code
	public final static String Tapping_on_country_code = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[1]";
	// ARROW BUTTON OPTION
	public final static String ARROW_BTN = "com.assured.singtel.release:id/ab_arrow";
	//com.test.assured:id/ab_arrow
	// Manage circle icon
	// 
//	Image icon
     public final static String MANAGE_CIRCULE_ICON ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[3]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[5]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";
    //////android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[3]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]
	public final static String Tapping_on_menu_sec=" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"; 
////android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[3]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]
	//Selecting the circule
	public final static String Selecting_the_circule="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[3]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[5]"; 
	// Remove btn
	public final static String Remove_btn="com.assured.singtel.release:id/remove_button"; 
   //Back btn //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.Button[1]
	public final static String Back_btn="com.assured.singtel.release:id/navigation_layout"; 
	
	public final static String Xpath_Tapping_on_cancel="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[1]";
	//Image icon
	public final static String Image_icon="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.ImageView[1]"; 
     //Second iagree
	public final static String Second_agree_btn="//android.widget.TextView[@text='I Agree']"; 
 	//back btn
	public final static String Back_btn_circule="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]";
}
