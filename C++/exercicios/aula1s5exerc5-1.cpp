#include <iostream>
using namespace std;


int main(int argc, char const *argv[])
{
    double valorProduto;
    double valorCompra, valorCompraDesconto;
    double desconto;
    int quantidadeProduto;
    cout<<"Hello World";
    cout<<"Digite o valor do produto ";
    cin >> valorProduto;
    cout<<"Digite a quantidade a ser comprada ";
    cin>>quantidadeProduto;
    valorCompra = valorProduto*
    quantidadeProduto;
    if (valorCompra<50){
          desconto = 1;  
    }else{
        if (50 < valorCompra < 100){
            desconto = 1 - 0.05;
        }else{
            desconto = 1 - 0.1;
        }
    
    }
    valorCompraDesconto = valorCompra*desconto;

    cout<<" O valor da compra foi = "<< valorCompra;
    cout<<" O valor do desconto foi = "<<(1 - desconto)*100<<"%";
    cout<<" Sendo o valor da compra com desconto = "<<valorCompraDesconto;

    return 0;
}
