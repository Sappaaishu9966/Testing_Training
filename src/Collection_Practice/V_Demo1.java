package Collection_Practice;
import java.util.Vector;

public class V_Demo1 {
	

		public static void main(String[] args) {
			Vector v1 = new Vector();
			v1.add("aishu");
			v1.add("i hate my life");
			v1.add("leave me alone");
			v1.add("alone");
			Vector v2=new Vector();
			v2.add("hey god");
			v2.add("cheraku");
			v2.add("manashie life hey weast");
			System.out.println(v1);
			v1.addAll(0,v2);
			System.out.print(v1);
			//v1.remove("aishu");//remove object or name
			v1.clear();
			System.out.println(v1);
			}
	}
