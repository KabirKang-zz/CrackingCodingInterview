#include <iostream>
using namespace std;
void reverse(char* str)
{
  char * beg = str;
  char * end = str;
  char tmp;
  if(str)
    {
      while(*end)
	{
	  ++end;
	}
      --end;

      while(beg<end)
	{
	  tmp = *beg;
	  *beg++ = *end;
	  *end-- = tmp;
	}

    }
  cout << str << endl;
}

int main()
{
  char str[6] = {'k','a','b','i','r','\0'};
  cout << str << endl;
  reverse(str);
  return 0;
}
