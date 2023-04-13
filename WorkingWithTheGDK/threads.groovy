//static method u can use without creating an instance of the class
def t = new Thread() { /* do something */}
t.start()

Thread.start{ /* do something */}
Thread.start('thread-name') { /* do something */}

//startDaemon allows the thread to continue running even after the appliction is exited
Thread.startDaemon{ /* do something */}
Thread.startDaemon('thread-name') { /* do something */}