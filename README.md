 * اللَّهُمَّ صَلِّ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما صَلَّيْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 * اللَّهُمَّ بَارِكْ علَى مُحَمَّدٍ وعلَى آلِ مُحَمَّدٍ، كما بَارَكْتَ علَى إبْرَاهِيمَ وعلَى آلِ إبْرَاهِيمَ؛ إنَّكَ حَمِيدٌ مَجِيدٌ
 
 



# MyConnection By Yousef Shaaban

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
Or  Add it in your root settings.gradle :

        dependencyResolutionManagement {
	        ...
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	 }
  
Step 2. Add the dependency

	dependencies {
		 implementation 'com.github.YousefShaabanSaad:MyConnectionJava:1.0.0'
	}

Step 3. In Activity

	public class MainActivity extends AppCompatActivity {
		 
		 @Override
		 protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			 ...
			//تعريف الكلاس
			MyConnectionJava myConnectionJava = new MyConnectionJava(this);
      
		        // لو تريد فحص الإتصال بالإنترنت
			if(myConnectionJava.isConnect()){
			    // internet connection
			    Toast.makeText(this, "internet connection", Toast.LENGTH_SHORT).show();
			}

		        // لو تريد فحص عدم الإتصال بالإنترنت
			if(myConnectionJava.isDisconnect()) {
			    // internet disconnect
			    // لكي يتم عرض رسالة عدم الإتصال
			    myConnectionJava.showDisconnectDialog();
			}
		  }
	}


# For contact
 * +201142747343
 * yousefshaabansaad42@gmail.com
	
