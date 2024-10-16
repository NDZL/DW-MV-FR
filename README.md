## DATAWEDGE, MODEL-VIEW, FRAGMENTS

### LIFECYCLE EVENTS

**LIFECYCLE
 
APP STARTUP WITH 1ST FRAGMENT DISPLAYED
MainActivity-onCreate
TransformFragment-onCreate
TransformFragment-onViewCreated
TransformFragment-onViewStateRestored
TransformFragment-onStart
MainActivity-onStart
MainActivity-onResume
TransformFragment-onResume
 
TRANSITION TO ANOTHER FRAGMENT
TransformFragment-onPause
TransformFragment-onStop
ReflowFragment-onCreate
ReflowFragment-onViewCreated
ReflowFragment-onViewStateRestored
ReflowFragment-onStart
TransformFragment-onDestroyView
ReflowFragment-onResume
 
POWERBUTTON PRESSED, ENTERING SLEEP MODE
ReflowFragment-onPause
MainActivity-onPause
ReflowFragment-onStop
MainActivity-onStop
ReflowFragment-onSaveInstanceState
TransformFragment-onSaveInstanceState
 
RESUMING FROM SLEEP MODE
MainActivity-onRestart
ReflowFragment-onStart
MainActivity-onStart
MainActivity-onResume
ReflowFragment-onResume
 
APP SHUTDOWN
ReflowFragment-onPause
MainActivity-onPause
ReflowFragment-onStop
MainActivity-onStop
ReflowFragment-onSaveInstanceState
TransformFragment-onSaveInstanceState
 
-----
 
DEVICE  DISPLAY TIMEOUT (TransformFragment was open)
TransformFragment-onPause
MainActivity-onPause
TransformFragment-onStop
MainActivity-onStop
TransformFragment-onSaveInstanceState
 
 
 
Based on the Responsive View Activity Model
