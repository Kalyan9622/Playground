#include<iostream>
int main()
{
  char ch;
  int a,b;
  std::cout<<"Enter first number :"<<" Enter second number :"<<" Menu";
  std::cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  std::cin>>a;
  std::cin>>b;
  std::cin>>ch;
  switch(ch)
  {
    case '1':
      std::cout<<"\n"<<a+b;
      break;
    case '2':
      std::cout<<"\n"<<a-b;
      break;
    case '3':
      std::cout<<"\n"<<a*b;
      break;
    case '4':
      std::cout<<"\n"<<a/b;
      break;
    case '5':
      std::cout<<"\n"<<a%b;
      break;
    default:
      std::cout<<"\n";
      std::cout<<"Invalid operation";
      break;
  }
  return 0;
}