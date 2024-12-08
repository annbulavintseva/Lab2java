package lab2;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Rea4 = " + ex4(3.56, 1.02, 3, 2.43));
        System.out.println("Rea5 = " + ex5(2.54, 1.23, -2.14, -0.23));
        System.out.println("Rea6 = " + ex6(-1.23, -0.34, 0.707, 2.312));
    }
    public static double ex4(double a, double b, double c, double d) {
        // Завдання №4
        double Numer = Math.pow(Math.tan(a), 1.0 / c); // Знаходимочисельник (Можна записати одним рядком, проте так гарніше)
        double Deno = 1 + (Math.sinh(b) / Math.log(Math.abs(d + c))); // Знаходимо знаменник
        double Res4 = Numer / Deno; // Ділимо чисельник на знаменник
        return Res4;
    }
    public static double ex5(double a, double b, double c, double d) {
        // Завдання №5
        double sqrtResult = c / d; // Попереднє обчислення
        if (sqrtResult < 0) {
            System.out.println("Помилка: Підкореневий вираз у sqrt() має бути невід'ємним");
            throw new IllegalArgumentException("Значення підкореневого виразу менше нуля.");
        }

        double acosArg = -(Math.sqrt(sqrtResult)); // Обчислюємо аргумент для acos
        if (acosArg < -1 || acosArg > 1) {
            System.out.println("Помилка: Аргумент для Math.acos виходить за межі [-1;1]");
            throw new IllegalArgumentException("Аргумент для acos виходить за межі допустимого діапазону.");
        }

        // Обчислюємо результат, якщо всі перевірки пройдено
        double Res5 = 2.0 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(acosArg));

        return Res5;
    }
    public static double ex6(double a, double b, double c, double d){
        // Завдання №6
        double Res6 = 3.0*(Math.log10( Math.abs(b/a)) + Math.sqrt(Math.sin(c)+ Math.exp(d))); //Записуємо формулу
        return Res6;
    }
}
