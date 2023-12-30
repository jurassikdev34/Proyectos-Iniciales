/*1. Escribe un programa que lea de la entrada de dos numeros y muestre
en la salida estandar su suma, resta, multiplicacion y division*/

#include<iostream>

using namespace std;

int main(){
	
	float numero1, numero2, suma, resta, multi, division;
	
	cout<<"Digite un numero: ";
	cin>>numero1;
	
	cout<<"Digite otro numero: ";
	cin>>numero2;
	
	suma = numero1+numero2;
	cout<<"La suma de estos numeros es: "<<suma<<endl;
	
	resta = numero1-numero2;
	cout<<"La resta de estos numeros es: "<<resta<<endl;
	
	multi = numero1*numero2;
	cout<<"La multiplicacion de estos numeros es: "<<multi<<endl;
	
	division = numero1/numero2;
	cout<<"La division de estos numeros es: "<<division<<endl;
	

	return 0;
}
