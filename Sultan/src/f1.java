
public class f1 {

	public static void main(String[] args) {
		Sultan st = new Sultan();
		System.out.println("��� �������: " + st.name);
		System.out.println("������� �������: " + st.age + " ���");
		System.out.println("�������� �������: " + st.wealth + " ��������� ������");
		System.out.println("���������� ��� � �������: " + st.wives + " ����");
		System.out.println("����� ���:");
		System.out.println("������ ���� - " + st.names[0]);
		System.out.println("������ ���� - " + st.names[1]);
		System.out.println("������ ���� - " + st.names[2]);
		System.out.println("������� ���:");
		System.out.println("������ ���� - " + st.ages[0] + " ���");
		System.out.println("������ ���� - " + st.ages[1] + " ���");
		System.out.println("������ ���� - " + st.ages[2] + " ���");
		System.out.println("���������� ������� ��� ������� �� 0 �� 1: ");
		System.out.println("������ ���� - " + st.beauty[0]);
		System.out.println("������ ���� - " + st.beauty[1]);
		System.out.println("������ ���� - " + st.beauty[2]);
		System.out.println("���������� ��������� ��� ������� �� 0 �� 1: ");
		System.out.println("������ ���� - " + st.harmfulness[0]);
		System.out.println("������ ���� - " + st.harmfulness[1]);
		System.out.println("������ ���� - " + st.harmfulness[2]);
	}

}

class Sultan
{
	String name;
	byte age;
	float wealth;
	int wives;
	String names[];
	int ages[];
	float beauty[];
	float harmfulness[];
	
	Sultan()
	{
		name= "����� I";
		age= (byte)30;
		wealth= 100f;
		wives=3;
		names = new String[3];
		names[0]= "������";
		names[1]= "����";
		names[2]= "�������";
		ages = new int[3];
		ages[0]=30;
		ages[1]=25;
		ages[2]=27;
		beauty = new float[3];
		beauty[0]= 0.7f;
		beauty[1]= 0.8f;
		beauty[2]= 0.75f;
		harmfulness= new float[3];
		harmfulness[0]= 0.2f;
		harmfulness[1]=0.3f;
		harmfulness[2]=0.1f;
	}
}


