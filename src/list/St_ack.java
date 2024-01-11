package list;

import java.util.Stack;

public class St_ack {

	public static void main(String[] args) {

			Stack <String> st=new Stack<String>();
			
			st.push("Aravind");
			
			st.push("Ganesh");
			
			st.push("Revanth");
			
			st.push("Harsha");
			
			st.push("Vamsi");
			
			st.push("Sai Krishna");
			
			st.pop();
									
			st.push("Aravind");
			
			System.out.println(st);//[Aravind, Ganesh, Revanth, Harsha, Vamsi, Aravind]
			
			System.out.println(st.push("Harsha"));//Harsha
			
			System.out.println(st);//[Aravind, Ganesh, Revanth, Harsha, Vamsi, Aravind, Harsha]
			
			System.out.println(st.capacity());//10
			
			System.out.println(st.elementAt(1));//Ganesh

			System.out.println(st);//[Aravind, Ganesh, Revanth, Harsha, Vamsi, Aravind, Harsha]
			
			System.out.println(st.peek());//Harsha
			
			System.out.println(st.pop());//	Harsha
			
			System.out.println(st);//[Aravind, Ganesh, Revanth, Harsha, Vamsi, Aravind]
			
			System.out.println(st.search("Revanth"));//4
			
			System.out.println(st.indexOf("Revanth"));//2


	}

}
