# sda_javawwa13_prog1
exercises done during Java classes

Używamy gita,
Jeżeli ktoś czuje się na siłach piszemy testy jednostkowe (bardzo zachęcam)

1. Napisz program który obliczy sumę dwóch liczb
    1. liczb podanych przez użytkownika w konsoli
    2. podanych jako argumenty wejściowe programu
2. Napisz program który dla liczby N obliczy sumę wszystkich wielokrotności 3 i 5 które są <= N (mniejsze lub równe)
```
N=10 
1 2 3 4 5 6 7 8 9 10
3 + 5 + 6 + 9 + 10 = 33
```
3. Napisz program który obliczy silnie liczy N.
Silnia to iloczyn liczb naturalnych <=N (mniejsze równe), silnie oznaczamy znakiem !, np: 3! = 3x2x1 = 6
    1. Napisz program iteracyjny
    2. Napisz program rekurencyjny
4. Napisz program który wypisze od tyłu tekst podany na wejściu konsoli.
    czyli "programuje w javie" -> "eivaj w ejumargorp"
5. Napisz program który obliczy średnią liczb podanych na wejściu konsoli.
6. Napisz program który sprawdzi czy osoba jest pełnoletnia.
    Program powinien wczytać z konsoli datę urodzenia w formacie dd.MM.yyyy i powiedzieć czy osoba jest pełnoletnia czy nie.
	Jak zamienić String na Date?
```
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date = format.parse("2010-10-10");
```
7. Napisz program który wczyta tekst i wypisze go używając wyłącznie wielkich liter.
    1. Zmodyfikuj program tak by po wypisaniu wejściu pozwolił wprowadzić kolejne słowa dopóki użytkownik nie poda "q!"
8. Napisz program który jako argument wejściowy (String[] args) przyjmie liczby oddzielone spacjami i następnie:
    1. wypisze wszystkie liczby w kolejności w jakiej zostały podane
    2. wypisze wszystkie liczby od tyłu
    3. wypisze wszystkie na nieparzystych pozycjach
    4. wypisze wszystkie podzielne przez 3
    5. wypisze sumę wszystkich
    6. wypisze sumę pierwszych 4
    7. wypisze sumę ostatnich 5 liczb które są większe niż 2
    8. wypisze sumę liczb od początku tablicy która przekracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
    9. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa 10, wypisz te liczby
    10. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa N, wypisz te liczby
        wejście będzie podane w formie: "N 1 2 13 100 4 10..."
9. Napisz program który wyświetli kwadrat z znaków * o boku 3
```
   ***
   * *
   ***
```

    1. Zmodyfikuj program tak by długość boku była wczytywana z wejścia

10. Napisz program który sprawdzi czy słowo jest palindromem
11. Napisz program który wyświetli N elementów ciągu fibonacciego
    1. Do każdego wypisanego elementu wypisz jego stosunek do poprzedniego elementu
    2. Ile elementów ciągu jesteś w stanie obliczyć używając zmiennych typu int? long? BigInteger?
12. Napisz program który podaną liczbę wejściową wyświetli w postaci binarnej (system dwójkowy)
13. Do programu wypisującego ciąg liczb fibonacciego dodaj wypisywanie liczb ciągu w postaci binarnej
14. Napisz program który zapisze w pliku .png kwadrat wypełniony na niebiesko, koło wypełnione na czerwono.
    Podpowiedź - kawałek kodu który tworzy plik png
```
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 100, 100);

        // this is how we set a color
        g2d.setColor(Color.yellow);
        // this is how we fill a rectangle
        g2d.fillRect(12, 24, 50, 50);
        // this is how we set one pixel
        g2d.fillRect(5, 10, 1, 1);

        // Disposes of this graphics context and releases any system resources that it is using.
        g2d.dispose();

        // Save as PNG
        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);
```
15. Wróćmy do programu fibonacci. Wykorzystajmy zapisywanie liczb w postaci binarnej i zapisywanie plików .png.
    Stwórz obrazek w którym każdy wiersz będzie reprezentował jeden element ciągu w postaci binarnej.
    Zamiast 0 zapisz biały piksel, zamiast 1 zapisz czarny piksel.
    Czyli obrazek powinien zaczynać się tak:
```
       1            ■
      10           ■ 
      11           ■■
     101          ■ ■
    1000         ■   
    1101  ->     ■■ ■
   10101        ■ ■ ■
  100010       ■   ■ 
  110111       ■■ ■■■
 1011001      ■ ■■  ■
10010000     ■  ■    
```
16. Napisz kalkulator stringów. Kalkulator operuje tylko na małych literach. Operacje które musi obsługiwać kalkulator:

    1. add
        
            "ala" + "mak" = "alamak"
            
    2. sub
        
            "ala" - "a" = "al"
            "ala" - "bba" = "al"
            "ala" - "xxx" = "ala"
            "ala" - "alaala" = ""
            
    3. sub_m
        
            "ala" -m "a" = ""
            "ala" -m "bba" = "bb"
            "ala" -m "xxx" = "xxx"
            
    4. uniq
        
            "ala" u = "al"
            "xxx" u = "x"
            "majtek" u = "majtek"
            
    5. inter
        
            "ala" u "aaa" = "aa"
            "kota" u "ole" = "o"
            "abcdefg" u "cdefghij" = "cdefg"
            
    6. dim_d
        
            "ala" o "aaa" = "la"
            "ala" o "xxx" = "alaxxx"
            "abcdefg" o "defghijkl" = "abcijkl"
            
17. Napisz program który sprawdzi czy dwa podane wyrazy są anagramami.
    1. Zmodyfikuj program tak by słowa do sprawdzenia wczytał z pliku. Nadal będą to tylko 2 słowa oddzielone znakiem nowej lini
    2. Zmodyfikuj program tak by znalazł wszystkie anagramy dla słów z pliku oddzielonych znakiem nowej lini. Do ostatecznego przetestowania programu użyj listy słów: http://codekata.com/data/wordlist.txt (do znalezienia jest 20683 anagramów)
