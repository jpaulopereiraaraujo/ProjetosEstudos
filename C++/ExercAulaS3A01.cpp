#include <iostream>

using namespace std;

int main()
{
    float precoProduto;
    int qtdeProduto;
    float valorCompra;

    valorCompra = precoProduto*qtdeProduto;
    printf("Digite a quantidade do produto: ");
    scanf("%d%*c", &qtdeProduto);
    printf("Digite o preço do produto: ");
    scanf("%f%*c", &precoProduto);
    printf(“%f”, valorCompra);

}
