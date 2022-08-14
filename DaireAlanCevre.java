package deneme;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double r, a, pi=3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yaricapini(r) giriniz: ");
        r=input.nextDouble();

        double daireAlan= pi*r*r;
        double daireCevre= 2*pi*r;

        System.out.println("Direnin cevresi: " + daireCevre);
        System.out.println("Dairenin Alani: " + daireAlan);

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulma
        System.out.print("merkez acı olcusunu(a) giriniz: ");
        a=input.nextDouble();

        double dairedilimAlan= (pi*(r*r)*a)/360;

        System.out.println("Daire Diliminin Alani: " + dairedilimAlan);

    }
}
