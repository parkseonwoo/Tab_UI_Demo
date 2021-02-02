#include <ESP8266WiFi.h>
#include <ESP8266WebServer.h>

IPAddress staticIP(192, 168, 0, 39);
IPAddress gateway(192, 168, 0, 1);
IPAddress subnet(255, 255, 255, 0);
IPAddress dns(8, 8, 8, 8);

#ifdef ESP32
#pragma message(THIS EXAMPLE IS FOR ESP8266 ONLY!)
#error Select ESP8266 board.
#endif

ESP8266WebServer server(80); // 80 is the port number

const char* ssid = "messlab";
const char* password = "ekdrneo402";

String ledon,ledoff,led1on,led1off;

void Redon()
{
  digitalWrite(5, HIGH);
  server.send(200, "text/html", ledon);
  
}

void Redoff()
{
  digitalWrite(5, LOW);
  server.send(200, "text/html", ledoff);
}

void setup() 
{
  Serial.begin(115200);
  WiFi.mode(WIFI_STA);
  WiFi.begin(ssid, password);
  WiFi.config(staticIP, subnet, gateway, dns);
  while (WiFi.status() != WL_CONNECTED)
  delay(500);
  Serial.print(WiFi.localIP());
  server.on("/led1on", Redon);
  server.on("/led1off", Redoff);
  server.begin();
  pinMode(5, OUTPUT);//D2
  digitalWrite(5, LOW);
  digitalWrite(5, LOW);
}

void loop()
{
  server.handleClient();
  delay(1);
}
