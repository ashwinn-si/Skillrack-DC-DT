/*You must define the function replaceByFirstOccurring(char strO) which accepts a string str
containing only alphabets and digits as the input. The function must modify the string str
based on the following conditions.
- Replace all the occurrences of the digits by the first occurring digit in S.
- Replace all the occurrences of the lower case consonants by the first occurring lower case
consonant in S.
- Replace all the occurrences of the lower case vowels by the first occurring lower case vowel in
s.
- Replace all the occurrences of the upper case consonants by the first occurring upper case
consonant in S.
Replace all the occurrences of the upper case vowels by the first occurring upper case vowel
in S.
Note: Do not define the maino function as it is already defined. You just modify the string str
as per the given condition. The modified string will be printed by the maino function.

Input
Ski117E3Rack57TOO

Output:
Skikk7E7Sikk77SEE

Explanation:
The given string is "Ski117E3Rack57TOO".
The first occurring digit is 7. After replacing all the digits by 7, the string becomes
Ski117E7Rack77T00
The first occurring lower case consonant is After replacing all the lower case consonants by
the string becomes Skikk7E7Rakk77TOO
The first occurring lower case vowel is After replacing all the lower case vowels by the
string becomes Skikk7E7Rikk77TOO
The first occurring upper case consonant is 'S. After replacing all the upper case consonants by
•S, the string becomes Skikk7E7Sikk77SOO
The first occurring upper case vowel is 'E'. After replacing all the upper case vowels by the
string becomes Skikk7E7Sikk77SEE
Hence the output is Skikk7E7Sikk77SEE
*/

public static void replaceByFirstOccurring(char[] str) {
    char digit='0';
    char l_c='0';
    char l_c_v='0';
    char u_c='0';
    char u_c_v='0';
    boolean flag_digit=false,l_c_flag=false,l_c_v_flag=false,u_c_flag=false,u_c_v_flag=false;
    for(char ch:str){
        if(!flag_digit && ch>='0' && ch<='9'){
            digit=ch;
            flag_digit=true;
        }else if(!l_c_v_flag && ch>='a' && ch<='z' && vowel_checker(ch)){
            l_c_v_flag=true;
            l_c_v=ch;
        }else if(!l_c_flag && ch>='a' && ch<='z'){
            l_c_flag=true;
            l_c=ch;
        }else if(!u_c_v_flag && ch>='A' && ch<='Z' && vowel_checker(ch)){
            u_c_v_flag=true;
            u_c_v=ch;
        }else if(!u_c_flag && ch>='A' && ch<='Z'){
            u_c_flag=true;
            u_c=ch;
        }
        if(u_c_flag && l_c_flag && u_c_v_flag && l_c_v_flag && flag_digit){
            break;
        }
    }
    
    //changing the indexing
    for(int i=0;i<str.length;i++){
        if(str[i]>='0' && str[i]<='9'){
            str[i]=digit;
        }else if(str[i]>='a' && str[i]<='z' && vowel_checker(str[i])){
            str[i]=l_c_v;
        }else if(str[i]>='a' && str[i]<='z'){
            str[i]=l_c;
        }else if(str[i]>='A' && str[i]<='Z' && vowel_checker(str[i])){
            str[i]=u_c_v;
        }else{
            str[i]=u_c;
        }
    }
    
}
static boolean vowel_checker(char ch){
    ch=Character.toLowerCase(ch);
    if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        return true;
    }
    return false;
}
