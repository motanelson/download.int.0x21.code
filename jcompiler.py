import os
import copy
import zlib

def save_compile(filename, text):
    
    compiles = zlib.compress(text.encode("utf-8"))
    with open(filename, "wb") as f:
        f.write(compiles)

def load_compile(filename):
    
    with open(filename, "rb") as f:
        compiles = f.read()
    return zlib.decompress(compiles).decode("utf-8")

compilers="javac --release 8 "
decompilers="javap -c -private "
print("\033c\033[47;31m\ngive me file to java to compile to jaba: ? \n")
a=input().strip()
#a="Hello.java"
b=a.replace(".java","")
os.system(compilers + a)
os.system(decompilers + b+".class > /tmp/out.txt")
b=a.find(".")
c=a
if b>-1:
    c=a[:b]+".jaba"
f1=open("/tmp/out.txt","r")
texts=f1.read()
f1.close()
save_compile(c,texts)