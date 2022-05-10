package ClassObekt;

public class BankAccount {
    int id = 10;
    String name = "Peter";
    double ballance = 100;

    double popolnenieScheta(double summaPopolnenia) {
        ballance += summaPopolnenia;
        return ballance;
    }

    double snyatieSoScheta(double summaSnyatia) {
        ballance -= summaSnyatia;
        return ballance;
    }

    void showInfo() {
        System.out.println("Id: " + id + ", " + "Name: " + name + ", " + "Ballance: " + ballance);
    }
}

class BankAccountTest{
    public static void main(String[] args){

            BankAccount MyAccount = new BankAccount();
            BankAccount YorAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Sergey";
            MyAccount.ballance = 11.512;

            YorAccount.id = 2;
            YorAccount.name = "Ivan";
            YorAccount.ballance = 10.59;

            HisAccount.id = 3;
            HisAccount.name = "Andrey";
            HisAccount.ballance = 8.40;

            MyAccount.showInfo();
            MyAccount.popolnenieScheta(350.89);
            MyAccount.showInfo();
            MyAccount.snyatieSoScheta(281.94);
            MyAccount.showInfo();
            System.out.println();

            YorAccount.showInfo();
            YorAccount.snyatieSoScheta(8.45);
            YorAccount.showInfo();
            YorAccount.popolnenieScheta(494.35);
            YorAccount.showInfo();
            System.out.println();

            HisAccount.showInfo();
            HisAccount.popolnenieScheta(593.78);
            HisAccount.showInfo();
            HisAccount.snyatieSoScheta(479.28);
            HisAccount.showInfo();













    }
}




