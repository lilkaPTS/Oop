package myEnums;

public enum Day {
    MONDAY{
        public void test(){
            System.out.println("Day.MONDAY owner this method!");
        }
    },
    TUESDAY{
        public void test(){
            System.out.println("Day.TUESDAY owner this method!");
        }
    },
    WEDNESDAY{
        public void test(){
            System.out.println("Day.WEDNESDAY owner this method!");
        }
    },
    THURSDAY{
        public void test(){
            System.out.println("Day.THURSDAY owner this method!");
        }
    },
    FRIDAY{
        public void test(){
            System.out.println("Day.FRIDAY owner this method!");
        }
    },
    SATURDAY{
        public void test(){
            System.out.println("Day.SATURDAY owner this method!");
        }
    },
    SUNDAY{
        public void test(){
            System.out.println("Day.SUNDAY owner this method!");
        }
    };
    public abstract void test();
}
