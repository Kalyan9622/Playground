#include<iostream>
using namespace std;
int main()
{
  int P,X,Y,W,T,TC;
  std::cin>>W;
  std::cin>>X;
  std::cin>>Y;
  T=W*X;
  TC= 100+(W*Y);
  P=T-TC;
  std::cout<<P;
}