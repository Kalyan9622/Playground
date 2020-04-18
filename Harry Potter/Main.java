#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x,y;
  std::cin>>n;
  x=n%10;
  y=n/1000;
  std::cout<<x+y;
}