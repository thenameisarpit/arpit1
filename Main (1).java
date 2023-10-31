class ThreadCout extends Thread{
    ThreadCout(String s){
        super(s);
        System.out.println(""new thread creater"+ this);
        start();
        
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("new thread created"+this);
                Thread.sleep(1500);
            }}
            catch(Exception e)
            {
                System.out.println("currently executing thread is interrupted");
                ]
                System.out.println("currently executing thread run is terminated");
                
            }
            }
        