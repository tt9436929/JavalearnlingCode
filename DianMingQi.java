import java.util.Random;
import java.util.Scanner;
class DianMingQi {
	/*//���������һ
	public static void addStudentName (String[] students) {
		// ����������ͬѧ�����洢��������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("�洢��" + (i + 1) + "������: ");
			students[i] = sc.next();
		}
	}
	
	//����ȫ��ͬѧ����
	public static void printStudentName (String[] students) {
		//�������飬�õ�ÿ��ͬѧ����
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			//��ӡͬѧ����
			System.out.println("��" + (i + 1) + "��ѧ������" + name);
		}
	}
	
	public static String randomStudentName (String[] students) {
		//�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt (students.length);   //indexΪ���������
		//ͨ����������������л�ȡ����
		String name = students[index];  //������ַ���������ת���������name
		//��������㵽������
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("���������");
		//����һ�����Դ洢���ͬѧ���������������飩
		String[] students = new String[i];
		
		addStudentName (students) ;
		
		printStudentName (students) ;
		
		String randomName = randomStudentName (students); //����
		System.out.println("���㵽����ͬѧ��:" + randomName);
	}	*/


/*
	�����������
		1.�洢����ѧ������,��ӹ���
		2.Ԥ������ѧ������,��������,�������
		3.�������Ϊ����,���������ҵ�Ԫ��,�����������
	�����ܶ�������,���ɷ���,���÷�������
	������������,�õ�ͬһ����������
	�����洢��������,��������,ʹ��ͬһ�������е�����,�������ݲ���
	
	��java��,����ʹ�����¸�ʽ������һ�����飺
		��������[] ������ = new ��������[Ԫ�ظ��������鳤��]
		
	�����������͵�ʹ��:
		�붨��Ļ����������ͱ�����ͬ,�����������͵ı��������Լ���ֵ��һ����Թ̶��Ĳ�����߸�ʽ��
		�������� ������ = new ��������();
	ÿ�������������Ͷ����书��,���ǿ��Ե��ø�����ʵ���Ĺ��ܣ�
		������.������()
		
	Scanner��ʹ�ò��裺
		S1.������import java.util.Scanner
		S2.��������ʵ����Scanner sc = new Scanner(System.in);
		S3.���÷�����
			int i = sc.nextInt();//�������տ���̨¼�������
			String s = sc.next();//�������տ���̨¼����ַ���
	
	Random��ʹ�ò��裺
		R1:������import java.util.Random;
		R2:��������ʵ����Random ran = Random();
		R3:���÷�����	
			int index = ran.nextInt(int maxValue);//����[0,maxValue)��Χ���������,����0,������maxValue
			double index = ran.nextDouble();//����[0,1)��Χ�����С��,����0.0,������1.0
*/

/*
//S1:������import java.util.Scanner
import java.util.Scanner;

//R1:������import java.util.Random;
import java.util.Random;
*/
	public static void main(String[] args){
		//��������,�洢ѧ������
		String[] names = new String[3];
		//���ܲ˵�ѡ��
		//��ѭ����Ϊ�˱�ֻ֤�а���������4���ܽ�������ϵͳ,�����һֱ������ȥ
		while(true){
			//���빦�ܵ�����,�������,��ֻ֤�а���������4���ܽ�������ϵͳ,�������ʹ�����ϵͳ
			int chooseNumber = chooseFunction();
			switch(chooseNumber){
				case 1:
						//1.���ѧ������
						System.out.println("=========�������ѧ������������=============");
						addStduentNames(names);
						System.out.println("============���ѧ����������==================");
				break;
				
				case 2:
						//2.����ѧ������					
						System.out.println("========���ڱ���ѧ������������==============");
						printStudentNames(names);
						System.out.println("============����ѧ����������==================");		

				break;
				
				case 3:
						//3.�����������
						System.out.println("=========��������������ܽ�����================");
						String ranName = RandomStudentName(names);
						System.out.println("���㵽�������ǣ�"+ranName);
						System.out.println("============����������ܽ���...==================");
						
				break;
				
				case 4:
						//��������
						System.out.println("============���˳�ϵͳ===========================");
				return;
				
				default:
						System.out.println("ϵͳ��ʱû�д����,����������...");
				break;
						
			}
		}
	}
	/*
		���巽��,ʵ�ֹ���ѡ��˵�����ѡ��
		����ֵ�� int
		������û��
	*/
	public static int chooseFunction(){	
		System.out.println("--------------------ѧ���������ϵͳ----------------------");
		System.out.println("1.���ѧ������");
		System.out.println("2.����ѧ������");
		System.out.println("3.�����������");
		System.out.println("4.�˳�ϵͳ");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ܼ�������
		//S2:��������ʵ����Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/*
		//1.���ѧ������
		���巽��,ʵ�������������Ԫ��(ͨ������̨��������)
		����ֵ�� û��
		������ ����(����)---�õ�ͬһ����������
	*/
	public static void addStduentNames(String[] names){
			//S2:��������ʵ����Scanner sc = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < names.length; i++){
				System.out.println("���ܵ�" + i + "ͬѧ����");
				//S3:�������տ���̨¼����ַ���
				names[i] = sc.next();
			}			
	}
	/*
		2.����ѧ������
		���巽��,forѭ����ӡ�����е�Ԫ��
		����ֵ��û��
		����������(����)---�õ�ͬһ����������
	*/
	public static void printStudentNames(String[] names){
		for(int i = 1; i <= names.length; i++){
			System.out.println("�� " + i + "��ѧ��������" + names[i-1]);
		}
		
	}
	/*
		3.�����������
		���巽��,�����������,��Ϊ����,������������õ�������Ԫ��
		����ֵ�� ����Ԫ��
		����������(����)---�õ�ͬһ����������
	*/
	public static String RandomStudentName(String[] names){
		//R2:��������ʵ����Random ran = Random();
		Random ran = new Random();
		//R3:���÷�����
		int index = ran.nextInt(names.length);
		return names[index];
	}
}


