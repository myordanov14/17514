#include<stdio.h>
#include<math.h>

int main(){

	float a, b, h, S;
	printf("Enter a: ");
	scanf("%f", &a);
	printf("Enter b: ");
	scanf("%f", &b);
	printf("Enter h: ");
	scanf("%f", &h);

	if(a <= 0 || b <= 0 || h <= 0){
		printf("Invalid figure!\n");
		return 1;
	}

	S = (a+b)/2*h;
	printf("S = %.2f\n", S);
	return 0;
}