void main() {

    Scanner scanner = new Scanner(System.in);

    IO.println("Digite o primeiro número: ");
    int num = scanner.nextInt();


    int maior = num;
    int menor = num;


    for (int i = 0; i < 4; i++) {
        IO.println("Digite o próximo número: ");
        num = scanner.nextInt();

        if (num > maior) {
            maior = num;
        }
        if (num < menor) {
            menor = num;
        }
    }

    IO.println("O maior número é: " + maior);
    IO.println("O menor número é: " + menor);





}