@ECHO OFF
SET vers=%1
@C:
CLS
TYPE \Users\mrc\Documents\2-NOTES\%1.TXT

if %vers%==clients (
@Q: 
CD \VSIS\ISC\
)

