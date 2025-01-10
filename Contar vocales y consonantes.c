//
// Created by usuario on 09/01/2025.
//
#include <stdio.h>

int countVowels(char* phrase){
    int count = 0;
    char c;

    for(int i = 0; c = phrase[i] != '\0'; i++){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            count ++;
           }
    }
    return count;
}
int countConsonants(char* phrase){
    int count = 0;
    char c;
    for(int i = 0; (c = phrase[i]) != '\0'; i++){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && <= 'Z')){
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
                count++;
                 }
        }
    }
    return count;

}

void getInput(char* phrase){
    printf("Pon la palabra qu quieras: ");
    gets(char* phrase){
        int i = 0;
        while(phrase[i] != '\0'){
            if(phrase[i] == '\0'){
                phrase[i] = '\0';
                break;
            }
            i++;
        }
    }
}

int main()
{
    char phrase[100];
    getInput(phrase);

    int vowels = countVowels(phrase);
    int consonants = countConsonants(phrase);

    printf("Numero de vocales: %d\n",vowels);
    printf("Numero de consonates: %d\n",consonants);

    return 0;
}
