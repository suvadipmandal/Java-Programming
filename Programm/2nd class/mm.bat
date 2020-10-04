@echo off
cls
if exist %1.java goto loads
echo import java.io.DataInputStream;>%1.java
echo class %1>>%1.java
echo {>>%1.java
echo public static void main(String args[])>>%1.java
echo {>>%1.java
echo.>>%1.java
echo.>>%1.java
echo }>>%1.java

echo }>>%1.java
:loads
notepad %1.java
javac %1.java
java %1
