class Client{
  public static void main(String [] args)
  {
    System.out.println("Hello world");
    System.out.println(Thread.currentThread().getName());
    doSomething();
  }
  public static void doSomething(){
    System.out.println("From do someting method");
    System.out.println(Thread.currentThread().getName());
  }

}
