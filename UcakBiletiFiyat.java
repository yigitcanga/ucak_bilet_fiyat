import java.util.Scanner;

public class UcakBiletiFiyat {
    public static void main(String[] args) {

        int dist, age, type;
        double cost_per_distance, discount_cost, discount, new_discount_cost;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz :");
        dist = input.nextInt();

        System.out.print("Yasinizi giriniz :");
        age = input.nextInt();

        System.out.print("Yolculuk tipini seciniz : 1-Tek Yon  2-Gidis-Donus :");
        type = input.nextInt();

        if (dist <= 0 || age <= 0) System.out.print("Hatali Veri Girdiniz");

        else
        {
            cost_per_distance = dist * 0.10;

            if (age < 12){
                discount = cost_per_distance / 2;
                discount_cost = cost_per_distance - discount;

                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar :");
                        System.out.println(discount_cost);
                        break;

                    case 2:
                        discount = discount_cost * 0.2;
                        new_discount_cost = discount_cost - discount;
                        System.out.println("Toplam Tutar :");
                        System.out.println(new_discount_cost*2);
                        break;

                    default:
                        System.out.print("Hatali Veri Girdiniz");
                        break;
                }

            }
            else if (12 <= age && age < 24){
                discount = cost_per_distance * 0.1;
                discount_cost = cost_per_distance - discount;

                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar :");
                        System.out.println(discount_cost);
                        break;

                    case 2:
                        discount = discount_cost * 0.2;
                        new_discount_cost = discount_cost - discount;
                        System.out.println("Toplam Tutar :");
                        System.out.println(new_discount_cost*2);
                        break;

                    default:
                        System.out.print("Hatali Veri Girdiniz");
                        break;
                }
            }
            else if (age > 65){
                discount = cost_per_distance * 0.3;
                discount_cost = cost_per_distance - discount;

                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar :");
                        System.out.println(discount_cost);
                        break;

                    case 2:
                        discount = discount_cost * 0.2;
                        new_discount_cost = discount_cost - discount;
                        System.out.println("Toplam Tutar :");
                        System.out.println(new_discount_cost*2);
                        break;

                    default:
                        System.out.print("Hatali Veri Girdiniz");
                        break;
                }
            }

            else {
                System.out.println("Toplam Tutar :");
                System.out.println(cost_per_distance);
            }
        }

    }
}
