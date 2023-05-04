#include<stdio.h>
struct poly{
    int coefficient;
    int exponent;
};
struct poly p1[5],p2[5],p3[5];
int readPoly(struct poly[]);
int addPoly(struct poly[], struct poly[], int, int, struct poly[]);
void displayPoly(struct poly[], int terms);
int main()
{
    int t1, t2, t3;
    t1 = readPoly(p1);
    printf("\n first polynomial: ");
    displayPoly(p1,t1);
    t2 = readPoly(p2);
    printf("\n second polynomial: ");
    displayPoly(p2,t2);
    t3 = addPoly(p1,p2,t1,t2,p3);
    printf("\n result: ");
    displayPoly(p3,t3);
}
int readPoly(struct poly p[5])
{
    int t1, i;
    printf("\n enter the total no. of terms in the polynomial: ");
    scanf("%d",&t1);
    for(i=0;i<t1;i++)
    {
        printf("enter the coefficient: ");
        scanf("%d",&p[i].coefficient);
        printf("enter the exponent: ");
        scanf("%d",&p[i].exponent);
    }
}
int addPoly(struct poly p1[5], struct poly p2[5], int t1, int t2, struct poly p3[5])
{
    int i, j, k;
    i=0;
    j=0;
    k=0;
    while(i<t1 && j<t2)
    {
        if(p1[i].exponent==p2[j].exponent)
        {
            p3[k].coefficient=p1[i].coefficient + p2[j].coefficient;
            p3[k].exponent= p1[i].exponent;
            i++;
            j++;
            k++;
        }
        else if(p1[i].exponent>p2[j].exponent)
        {
            p3[k].coefficient=p1[i].coefficient;
            p3[k].exponent=p1[i].exponent;
            i++;
            k++;
        }
        else
        {
            p3[k].coefficient=p2[j].coefficient;
            p3[k].exponent=p2[j].exponent;
            j++;
            k++;
        }
        while(i<t1)
        {
            p3[k].coefficient=p1[i].coefficient;
            p3[k].exponent=p1[i].exponent;
            i++;
            k++;
        }
        while(j<t2)
        {
            p3[k].coefficient=p2[j].coefficient;
            p3[k].exponent=p2[j].exponent;
            j++;
            k++;
        }
        return(k);
    }
}
void displayPoly(struct poly p[5], int term)
{
    int k;
    for(k=0;k<term-1;k++)
    printf("%d(x^%d)+",p[k].coefficient,p[k].exponent);
    printf("%d(x^%d)",p[term-1].coefficient,p[term-1].exponent);
}