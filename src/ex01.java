
void main() {

    Scanner sc = new Scanner(System.in);

    IO.println("digite um numero que vc deseja ver o resultado fatorial");

    int n = sc.nextInt();

    for (int i = n - 1; i >= 2; i--) {
        n *=i;
        IO.println(n);
    }
}






