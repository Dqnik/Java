
public class f1 {

	public static void main(String[] args) {
		Sultan st = new Sultan();
		System.out.println("Имя султана: " + st.name);
		System.out.println("Возраст султана: " + st.age + " лет");
		System.out.println("Богатсво султана: " + st.wealth + " миллионов золота");
		System.out.println("Количество жен у султана: " + st.wives + " жены");
		System.out.println("Имена жен:");
		System.out.println("Первая жена - " + st.names[0]);
		System.out.println("Вторая жена - " + st.names[1]);
		System.out.println("Третья жена - " + st.names[2]);
		System.out.println("Возраст жен:");
		System.out.println("Первая жена - " + st.ages[0] + " лет");
		System.out.println("Вторая жена - " + st.ages[1] + " лет");
		System.out.println("Третья жена - " + st.ages[2] + " лет");
		System.out.println("Коэффицент красоты жен султана от 0 до 1: ");
		System.out.println("Первая жена - " + st.beauty[0]);
		System.out.println("Вторая жена - " + st.beauty[1]);
		System.out.println("Третья жена - " + st.beauty[2]);
		System.out.println("Коэффицент вредности жен султана от 0 до 1: ");
		System.out.println("Первая жена - " + st.harmfulness[0]);
		System.out.println("Вторая жена - " + st.harmfulness[1]);
		System.out.println("Третья жена - " + st.harmfulness[2]);
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
		name= "Мурад I";
		age= (byte)30;
		wealth= 100f;
		wives=3;
		names = new String[3];
		names[0]= "Халиме";
		names[1]= "Кера";
		names[2]= "Оливера";
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


