package day9.test;

public  class Body {
    public Boolean live = true;
    public void walk(){
        System.out.println("走路");
    }


    class Heart{
        public void jump(){
            if(live){
                System.out.println("心脏跳动");
            }
            else {
                System.out.println("心脏不动");
            }
        }
    }
}
