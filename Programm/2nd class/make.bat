@echo off
cls
notepad %1.java
javac %1.java
if not exist %1.class notepad %1.java
java %1
