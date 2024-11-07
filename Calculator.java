/**
 * Kalkulator sederhana untuk melakukan operasi aritmatika dasar.
 * Mendukung operasi penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator {

    /**
     * Menjumlahkan dua bilangan.
     * 
     * @param number1 Bilangan pertama.
     * @param number2 Bilangan kedua.
     * @return Hasil penjumlahan number1 dan number2.
     */
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Mengurangkan dua bilangan.
     * 
     * @param number1 Bilangan pertama.
     * @param number2 Bilangan kedua.
     * @return Hasil pengurangan number1 dan number2.
     */
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Mengalikan dua bilangan.
     * 
     * @param number1 Bilangan pertama.
     * @param number2 Bilangan kedua.
     * @return Hasil perkalian number1 dan number2.
     */
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Membagi dua bilangan.
     * 
     * @param number1 Bilangan pertama (pembilang).
     * @param number2 Bilangan kedua (penyebut). Tidak boleh 0.
     * @return Hasil pembagian number1 dan number2.
     * @throws IllegalArgumentException jika number2 adalah 0.
     */
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Penyebut tidak boleh 0.");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10;
        double num2 = 5;

        System.out.printf("Penjumlahan: %.2f%n", calculator.add(num1, num2));
        System.out.printf("Pengurangan: %.2f%n", calculator.subtract(num1, num2));
        System.out.printf("Perkalian: %.2f%n", calculator.multiply(num1, num2));
        System.out.printf("Pembagian: %.2f%n", calculator.divide(num1, num2));
    }
}
