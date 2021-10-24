import java.util.*;


class stack{
static final int MAX = 1000;
int top;
int a[] = new int[MAX];

boolean isempty(){ return (top<0);}
stack(){top=-1;}
 boolean push(int x)
{
	if(top>=MAX-1){System.out.println("Stack Overflow"); return false;}
	else{a[++top] = x;
		System.out.println(x +"pushed into stack");
		return true;}
}
int pop(){
if(top<0){
	System.out.println("Stack overflow");
	return 0;
	}
	else{
		int x = a[top--];
		return x;
	}
}

int peek(){
if(top<0){	System.out.println("Stack underflow");	return 0;}
else{	int x = a[top]; return x;}
}
}





class ma{
public static void main(String arg[])
{
//Scanner in = new Scanner(System.in);
stack su = new stack();
//int x = in.nextInt();
su.push(150);
su.push(150);
su.push(150);
su.push(150);
System.out.println(su.pop()+"poped element");
}
}