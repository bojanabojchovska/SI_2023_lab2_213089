# Бојана Бојчовска 213089


![dijagram drawio](https://github.com/bojanabojchovska/SI_2023_lab2_213089/assets/126956163/3db94830-c202-4808-81bb-cd6a2058aed3)


Цикломатската комплексност е видлива од самиот Control Flow Graph, каде имаме 10 региони и +1 за целиот граф добиваме 11;
Истиот резултат се добива и при броење на 10те предикатни јазли (10+1=11);
И при одземање на ребрата со јазли +1=====(34-25+1=11)

За EveryBranch потребни се 5 тест случаеви за да се поминат сите патеки, тие се:
1. со корисник нул, 
2. no username valid&existing email, vtor korisnik, valieden pass so karakter sto ne e na prva pozicija,
3. username postoi, email nema @, pass<8 
4. username se sofpagja email ne, pass ima prazno mesto
5. username/email nevazno, pass nema specialcharacter

za if (user==null || user.getPassword()==null || user.getEmail()==null) imame 4 test slucaevi 
1. user=null                                        T
2. user ne e null, ama passwordot e null            F T
3. user i password ne se null ama emailot e         F F T
4. nitu eden ne e null                              F F F 

![everyBranch](https://github.com/bojanabojchovska/SI_2023_lab2_213089/assets/126956163/cd1f0d0a-70ac-453b-adba-ffe25b3ac95a)

