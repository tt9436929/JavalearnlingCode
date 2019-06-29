import java.util.Random;
import java.util.Scanner;
class DianMingQi {
	/*//随机点名器一
	public static void addStudentName (String[] students) {
		// 键盘输入多个同学姓名存储到容器中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("存储第" + (i + 1) + "个姓名: ");
			students[i] = sc.next();
		}
	}
	
	//总览全班同学姓名
	public static void printStudentName (String[] students) {
		//遍历数组，得到每个同学姓名
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			//打印同学姓名
			System.out.println("第" + (i + 1) + "个学生姓名" + name);
		}
	}
	
	public static String randomStudentName (String[] students) {
		//根据数组长度，获取随机索引
		int index = new Random().nextInt (students.length);   //index为随机的数字
		//通过随机索引从数组中获取姓名
		String name = students[index];  //随机数字放在数组里转换成随机的name
		//返回随机点到的姓名
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("随机点名器");
		//创建一个可以存储多个同学姓名的容器（数组）
		String[] students = new String[i];
		
		addStudentName (students) ;
		
		printStudentName (students) ;
		
		String randomName = randomStudentName (students); //定义
		System.out.println("被点到名的同学是:" + randomName);
	}	*/


/*
	随机点名器二
		1.存储所有学生姓名,添加功能
		2.预览所有学生姓名,遍历数组,浏览功能
		3.随机数作为索引,到数组中找到元素,随机点名功能
	将功能独立出来,作成方法,调用方法即可
	定义三个功能,用到同一个姓名数据
	姓名存储到数组中,三个方法,使用同一个数组中的数据,方法传递参数
	
	在java中,可以使用以下格式来定义一个数组：
		数组类型[] 数组名 = new 数据类型[元素个数或数组长度]
		
	引用数据类型的使用:
		与定义的基本数据类型变量不同,引用数据类型的变量定义以及赋值有一个相对固定的步骤或者格式：
		数据类型 变量名 = new 数据类型();
	每种引用数据类型都有其功能,我们可以调用该类型实例的功能：
		变量名.方法名()
		
	Scanner类使用步骤：
		S1.导包：import java.util.Scanner
		S2.创建对象实例：Scanner sc = new Scanner(System.in);
		S3.调用方法：
			int i = sc.nextInt();//用来接收控制台录入的数字
			String s = sc.next();//用来接收控制台录入的字符串
	
	Random类使用步骤：
		R1:导包：import java.util.Random;
		R2:创建对象实例：Random ran = Random();
		R3:调用方法：	
			int index = ran.nextInt(int maxValue);//产生[0,maxValue)范围的随机整数,包含0,不包含maxValue
			double index = ran.nextDouble();//产生[0,1)范围的随机小数,包含0.0,不包含1.0
*/

/*
//S1:导包：import java.util.Scanner
import java.util.Scanner;

//R1:导包：import java.util.Random;
import java.util.Random;
*/
	public static void main(String[] args){
		//定义数组,存储学生姓名
		String[] names = new String[3];
		//功能菜单选择：
		//加循环是为了保证只有俺按了数字4才能结束整个系统,否则会一直运行下去
		while(true){
			//输入功能的数字,必须放这,保证只有俺按了数字4才能结束整个系统,否则继续使用这个系统
			int chooseNumber = chooseFunction();
			switch(chooseNumber){
				case 1:
						//1.添加学生姓名
						System.out.println("=========处于添加学生姓名进行中=============");
						addStduentNames(names);
						System.out.println("============添加学生姓名结束==================");
				break;
				
				case 2:
						//2.遍历学生姓名					
						System.out.println("========处于遍历学生姓名进行中==============");
						printStudentNames(names);
						System.out.println("============遍历学生姓名结束==================");		

				break;
				
				case 3:
						//3.随机点名功能
						System.out.println("=========处于随机点名功能进行中================");
						String ranName = RandomStudentName(names);
						System.out.println("被点到的名字是："+ranName);
						System.out.println("============随机点名功能结束...==================");
						
				break;
				
				case 4:
						//结束程序
						System.out.println("============已退出系统===========================");
				return;
				
				default:
						System.out.println("系统暂时没有此项功能,还在完善中...");
				break;
						
			}
		}
	}
	/*
		定义方法,实现功能选择菜单数字选择
		返回值？ int
		参数？没有
	*/
	public static int chooseFunction(){	
		System.out.println("--------------------学生随机点名系统----------------------");
		System.out.println("1.添加学生姓名");
		System.out.println("2.遍历学生姓名");
		System.out.println("3.随机点名功能");
		System.out.println("4.退出系统");
		System.out.println("请输入要执行的操作序号：");
		//接受键盘输入
		//S2:创建对象实例：Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/*
		//1.添加学生姓名
		定义方法,实现向数组中添加元素(通过控制台键盘输入)
		返回值？ 没有
		参数？ 数组(容器)---用到同一个姓名数据
	*/
	public static void addStduentNames(String[] names){
			//S2:创建对象实例：Scanner sc = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < names.length; i++){
				System.out.println("接受第" + i + "同学姓名");
				//S3:用来接收控制台录入的字符串
				names[i] = sc.next();
			}			
	}
	/*
		2.遍历学生姓名
		定义方法,for循环打印数组中的元素
		返回值？没有
		参数？数组(容器)---用到同一个姓名数据
	*/
	public static void printStudentNames(String[] names){
		for(int i = 1; i <= names.length; i++){
			System.out.println("第 " + i + "个学生姓名：" + names[i-1]);
		}
		
	}
	/*
		3.随机点名功能
		定义方法,产生随机整数,作为索引,返回随机索引拿到的数组元素
		返回值？ 数组元素
		参数？数组(容器)---用到同一个姓名数据
	*/
	public static String RandomStudentName(String[] names){
		//R2:创建对象实例：Random ran = Random();
		Random ran = new Random();
		//R3:调用方法：
		int index = ran.nextInt(names.length);
		return names[index];
	}
}


