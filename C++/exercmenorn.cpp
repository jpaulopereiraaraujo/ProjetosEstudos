#include <iostream>
using namespace std;
int main(){

    float valor;
    float desconto;
    cout<<"Digite o valor";
    cin >> valor;

    if (valor < 100){
        desconto  = 0;
        cout<<"Menor que 200";

    }
    if (valor >= 100 and valor<= 200){
            desconto = 0.05;
    }
    if (valor >200){
        desconto = desconto/10;
        cout<<"Maior que 200";
        cout<<"Valor com desconto é :"<<(valor+valor*desconto);
        
            
        

    }
    cout<< "O valor com desconto é :"<<valor*(1-desconto);
    cout<< "    O Desconto foi de : "<<desconto*100<<"%";
    cout<<" ";

}
