package chap06;

import java.util.Scanner;

public class BankApplication {
    public static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.println("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if( selectNo ==2){
                accountList();
            } else if( selectNo ==3 ){
                deposit();
            } else if( selectNo ==4 ){
                withdraw();
            } else if( selectNo == 5 ){
                run = false;
            }
        }
        System.out.println("프로그램 종료");

    }


            private static void createAccount() {
                System.out.println("계좌번호: ");
                String ano = scanner.next();
                System.out.println("게좌주: ");
                String owner = scanner.next();
                System.out.println("초기입금액: ");
                int balance = scanner.nextInt();
                Account account = new Account(ano, owner, balance);
                for(int i=0;i<accountArray.length;i++){
                    if(accountArray[i]==null){
                        accountArray[i] = account;
                        System.out.println("결과: 계좌가 생성되었습니다.");
                        break;
                    }
                }
            }

            private static void accountList(){
                System.out.println("-----------------");
                System.out.println("계좌목록");
                System.out.println("------------------");
                for (int i =0;i<accountArray.length;i++){
                    if(accountArray[i] == null) break;//이거안해주면 배열맨끝에서 오류
                    System.out.println(accountArray[i].getAno() +"   " +
                            accountArray[i].getOwner()+"   "+accountArray[i].getBalance());
                }

            }

            private static void deposit() {
                System.out.println("---------------------");
                System.out.println("예금");
                System.out.println("---------------------");
                System.out.print("계좌번호: ");
                String ano = scanner.next();
                System.out.print("예금액: ");
                int money = scanner.nextInt();
                if(findAccount(ano) == null) {
                    System.out.println("계좌정보가 없습니다.");
                }
                else {
                    int balance = findAccount(ano).getBalance() + money;
                    findAccount(ano).setBalance(balance);
                    System.out.println("예금이 성공되었습니다.");
                }
            }

            private static void withdraw(){
                System.out.println("--------------------");
                System.out.println("출금");
                System.out.println("--------------------");
                System.out.print("계좌변호: ");
                String ano = scanner.next();
                System.out.print("출금액: " );
                int money = scanner.nextInt();
                if(findAccount(ano) == null) {
                    System.out.println("계좌정보가 없습니다.");
                }
                else {
                    int balance = findAccount(ano).getBalance() - money;
                    findAccount(ano).setBalance(balance);
                    System.out.println("출금이 성공되었습니다.");
                }
            }

            private static Account findAccount(String ano){
                Account account = null;

                for(int i=0;i<accountArray.length;i++){
                    if(accountArray[i] != null ){
                        if(accountArray[i].getAno().equals(ano) ) { // == 으로 하면 예금정보가 없다고 나옴,   ==:저장된 번지가 같은가,같은 주소를 참조하는가/equals:String이나 객체의 내용이 같은가
                            account = accountArray[i];
                            break;
                        }
                    } else {  return null; }
                }
                return account;
            }

}
