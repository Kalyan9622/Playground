#include<iostream>
int main()
{
  int mw,wf;
  std::cin>>mw>>wf;
  if(mw>wf)
  {
    std::cout<<"Yes, you can enter.";
  }
  if(mw==wf)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  if(mw<wf)
  {
   std::cout<<"Sorry, you can't enter";
  }
}
    