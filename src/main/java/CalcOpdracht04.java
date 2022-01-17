public class CalcOpdracht04 {

    public static void main(String[] args)

        {
            System.out.println(sum(-25, 50));

            System.out.println(mul(5, 4));
        }

        public static double sum ( double n1, double n2){

            return Math.abs(n1) + Math.abs(n2);

        }
        public static double mul ( double n1, double n2){

            return Math.abs(n1) * Math.abs(n2);

        }
        public static double sqrt ( double n){
            return Math.sqrt(n);
        }

}
