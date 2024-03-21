#
# A fatal error has been detected by the Java Runtime Environment:
#
#  SIGSEGV (0xb) at pc=0x00007f5fc843f920, pid=15194, tid=15198
#
# JRE version: Java(TM) SE Runtime Environment (11.0.4+10) (build 11.0.4+10-LTS)
# Java VM: Java HotSpot(TM) 64-Bit Server VM (11.0.4+10-LTS, mixed mode, tiered, compressed oops, serial gc, linux-amd64)
# Problematic frame:
# V  [libjvm.so+0x63f920]  CompileBroker::make_thread(_jobject*, CompileQueue*, AbstractCompiler*, bool, Thread*)+0x240
#
# Core dump will be written. Default location: Core dumps may be processed with "/usr/share/apport/apport -p%p -s%s -c%c -d%d -P%P -u%u -g%g -- %E" (or dumping to /home/core.15194)
#
# If you would like to submit a bug report, please visit:
#   http://bugreport.java.com/bugreport/crash.jsp
#

---------------  S U M M A R Y ------------

Command Line: Main

Host: Intel(R) Xeon(R) CPU @ 2.00GHz, 8 cores, 6G, Ubuntu 22.04.1 LTS
Time: Thu Mar 21 11:39:40 2024 UTC elapsed time: 0 seconds (0d 0h 0m 0s)

---------------  T H R E A D  ---------------

Current thread (0x00007f5fc000f800):  JavaThread "main" [_thread_in_vm, id=15198, stack(0x00007f5fc92d8000,0x00007f5fc93d8000)]

Stack: [0x00007f5fc92d8000,0x00007f5fc93d8000],  sp=0x00007f5fc93d6920,  free space=1018k
Native frames: (J=compiled Java code, A=aot compiled Java code, j=interpreted, Vv=VM code, C=native code)
V  [libjvm.so+0x63f920]  CompileBroker::make_thread(_jobject*, CompileQueue*, AbstractCompiler*, bool, Thread*)+0x240
V  [libjvm.so+0x63ff16]  CompileBroker::init_compiler_sweeper_threads()+0x586
V  [libjvm.so+0x6401fd]  CompileBroker::compilation_init_phase1(Thread*)+0x8d
V  [libjvm.so+0xdc4193]  Threads::create_vm(JavaVMInitArgs*, bool*)+0x893
V  [libjvm.so+0x910c02]  JNI_CreateJavaVM+0x52
C  [libjli.so+0x4a66]  JavaMain+0x86


siginfo: si_signo: 11 (SIGSEGV), si_code: 1 (SEGV_MAPERR), si_addr: 0x0000000000000008

Register to memory mapping:

RAX=0x00007f5fc92046e2: <offset 0x00000000014046e2> in /opt/jdk/jdk-11.0.4/lib/server/libjvm.so at 0x00007f5fc7e00000
RBX=0x00007f5fc00b5800 points into unknown readable memory: 20 31 15 c9 5f 7f 00 00
RCX=0x0 is NULL
RDX=0x0 is NULL
RSP=0x00007f5fc93d6920 is pointing into the stack for thread: 0x00007f5fc000f800
RBP=0x00007f5fc93d6960 is pointing into the stack for thread: 0x00007f5fc000f800
RSI=0x00007f5fc00008e0 points into unknown readable memory: 00 00 00 00 00 00 01 00
RDI=0x00007f5fc000db50 points into unknown readable memory: 00 00 00 00 00 00 00 00
R8 =0x00007f5fc00b7030 points into unknown readable memory: b7 00 fc f5 07 00 00 00
R9 =0x000000007fffffff is an unknown value
R10=0x0 is NULL
R11=0xc45c3f37323371d0 is an unknown value
R12=0x00007f5fc00122d0 points into unknown readable memory: d8 07 42 90 00 00 00 00
R13=0x00007f5fc000db50 points into unknown readable memory: 00 00 00 00 00 00 00 00
R14=0x0 is NULL
R15=0x0 is NULL


Registers:
RAX=0x00007f5fc92046e2, RBX=0x00007f5fc00b5800, RCX=0x0000000000000000, RDX=0x0000000000000000
RSP=0x00007f5fc93d6920, RBP=0x00007f5fc93d6960, RSI=0x00007f5fc00008e0, RDI=0x00007f5fc000db50
R8 =0x00007f5fc00b7030, R9 =0x000000007fffffff, R10=0x0000000000000000, R11=0xc45c3f37323371d0
R12=0x00007f5fc00122d0, R13=0x00007f5fc000db50, R14=0x0000000000000000, R15=0x0000000000000000
RIP=0x00007f5fc843f920, EFLAGS=0x0000000000010202, CSGSFS=0x002b000000000033, ERR=0x0000000000000004
  TRAPNO=0x000000000000000e

Top of Stack: (sp=0x00007f5fc93d6920)
0x00007f5fc93d6920:   00007f5fc93d6901 0000000000000000
0x00007f5fc93d6930:   00007f5fc93d6960 00000000904207d8
0x00007f5fc93d6940:   00007f5fc000f800 0000000000000001
0x00007f5fc93d6950:   00007f5fc93d69e0 00007f5fc92046e2 

Instructions: (pc=0x00007f5fc843f920)
0x00007f5fc843f900:   48 8d 05 99 d7 dd 00 8b 70 24 eb c2 0f 1f 40 00
0x00007f5fc843f910:   48 8d 05 cb 4d dc 00 80 38 00 0f 84 70 ff ff ff
0x00007f5fc843f920:   41 8b 47 08 85 c0 0f 8e 64 ff ff ff 48 89 df 31
0x00007f5fc843f930:   db e8 7a ae 77 00 e9 23 ff ff ff 0f 1f 44 00 00 

Stack slot to memory mapping:
stack at sp + 0 slots: 0x00007f5fc93d6901 is pointing into the stack for thread: 0x00007f5fc000f800
stack at sp + 1 slots: 0x0 is NULL
stack at sp + 2 slots: 0x00007f5fc93d6960 is pointing into the stack for thread: 0x00007f5fc000f800
stack at sp + 3 slots: 0x00000000904207d8 is an oop: java.lang.Thread 
{0x00000000904207d8} - klass: 'java/lang/Thread'
stack at sp + 4 slots: 0x00007f5fc000f800 is a thread
stack at sp + 5 slots: 0x0000000000000001 is an unknown value
stack at sp + 6 slots: 0x00007f5fc93d69e0 is pointing into the stack for thread: 0x00007f5fc000f800
stack at sp + 7 slots: 0x00007f5fc92046e2: <offset 0x00000000014046e2> in /opt/jdk/jdk-11.0.4/lib/server/libjvm.so at 0x00007f5fc7e00000


---------------  P R O C E S S  ---------------

Threads class SMR info:
_java_thread_list=0x00007f5fc00b1390, length=6, elements={
0x00007f5fc000f800, 0x00007f5fc0099000, 0x00007f5fc009d000, 0x00007f5fc00af800,
0x00007f5fc00b1800, 0x00007f5fc00b3800
}

Java Threads: ( => current thread )
=>0x00007f5fc000f800 JavaThread "main" [_thread_in_vm, id=15198, stack(0x00007f5fc92d8000,0x00007f5fc93d8000)]
  0x00007f5fc0099000 JavaThread "Reference Handler" daemon [_thread_blocked, id=15200, stack(0x00007f5fc7100000,0x00007f5fc7200000)]
  0x00007f5fc009d000 JavaThread "Finalizer" daemon [_thread_blocked, id=15201, stack(0x00007f5fc5f2c000,0x00007f5fc602c000)]
  0x00007f5fc00af800 JavaThread "Signal Dispatcher" daemon [_thread_blocked, id=15202, stack(0x00007f5fc5af2000,0x00007f5fc5bf2000)]
  0x00007f5fc00b1800 JavaThread "C2 CompilerThread0" daemon [_thread_blocked, id=15203, stack(0x00007f5fc59f2000,0x00007f5fc5af2000)]
  0x00007f5fc00b3800 JavaThread "C1 CompilerThread0" daemon [_thread_blocked, id=15204, stack(0x00007f5fc58f2000,0x00007f5fc59f2000)]

Other Threads:
  0x00007f5fc0090800 VMThread "VM Thread" [stack: 0x00007f5fc7500000,0x00007f5fc7600000] [id=15199]

Threads with active compile tasks:

VM state:not at safepoint (normal execution)

VM Mutex/Monitor currently owned by a thread: None

Heap address: 0x0000000090400000, size: 1788 MB, Compressed Oops mode: 32-bit
Narrow klass base: 0x0000000000000000, Narrow klass shift: 3
Compressed class space size: 1073741824 Address: 0x0000000100000000

Heap:
 def new generation   total 34432K, used 1226K [0x0000000090400000, 0x0000000092950000, 0x00000000b5800000)
  eden space 30656K,   4% used [0x0000000090400000, 0x00000000905329c0, 0x00000000921f0000)
  from space 3776K,   0% used [0x00000000921f0000, 0x00000000921f0000, 0x00000000925a0000)
  to   space 3776K,   0% used [0x00000000925a0000, 0x00000000925a0000, 0x0000000092950000)
 tenured generation   total 76480K, used 0K [0x00000000b5800000, 0x00000000ba2b0000, 0x0000000100000000)
   the space 76480K,   0% used [0x00000000b5800000, 0x00000000b5800000, 0x00000000b5800200, 0x00000000ba2b0000)
 Metaspace       used 2073K, capacity 4480K, committed 4480K, reserved 1056768K
  class space    used 168K, capacity 384K, committed 384K, reserved 1048576K

Card table byte_map: [0x00007f5fc6a81000,0x00007f5fc6e00000] _byte_map_base: 0x00007f5fc65ff000

Polling page: 0x00007f5fc9958000

Metaspace:

Usage:
  Non-class:      4.00 MB capacity,     1.86 MB ( 47%) used,     2.14 MB ( 53%) free+waste,    64 bytes ( <1%) overhead. 
      Class:    384.00 KB capacity,   168.14 KB ( 44%) used,   215.80 KB ( 56%) free+waste,    64 bytes ( <1%) overhead. 
       Both:      4.38 MB capacity,     2.02 MB ( 46%) used,     2.35 MB ( 54%) free+waste,   128 bytes ( <1%) overhead. 

Virtual space:
  Non-class space:        8.00 MB reserved,       4.00 MB ( 50%) committed 
      Class space:        1.00 GB reserved,     384.00 KB ( <1%) committed 
             Both:        1.01 GB reserved,       4.38 MB ( <1%) committed 

Chunk freelists:
   Non-Class:  0 bytes
       Class:  0 bytes
        Both:  0 bytes

CodeHeap 'non-profiled nmethods': size=120036Kb used=0Kb max_used=0Kb free=120036Kb
 bounds [0x00007f5fb06e7000, 0x00007f5fb0957000, 0x00007f5fb7c20000]
CodeHeap 'profiled nmethods': size=120032Kb used=0Kb max_used=0Kb free=120032Kb
 bounds [0x00007f5fa91af000, 0x00007f5fa941f000, 0x00007f5fb06e7000]
CodeHeap 'non-nmethods': size=5692Kb used=969Kb max_used=981Kb free=4722Kb
 bounds [0x00007f5fa8c20000, 0x00007f5fa8e90000, 0x00007f5fa91af000]
 total_blobs=248 nmethods=0 adapters=119
 compilation: enabled
              stopped_count=0, restarted_count=0
 full_count=0

Compilation events (0 events):
No events

GC Heap History (0 events):
No events

Deoptimization events (0 events):
No events

Classes redefined (0 events):
No events

Internal exceptions (0 events):
No events

Events (10 events):
Event: 0.044 loading class jdk/internal/misc/OSEnvironment done
Event: 0.044 loading class java/lang/System$2
Event: 0.044 loading class jdk/internal/misc/JavaLangAccess
Event: 0.044 loading class jdk/internal/misc/JavaLangAccess done
Event: 0.044 loading class java/lang/System$2 done
Event: 0.044 loading class java/lang/IllegalArgumentException
Event: 0.045 loading class java/lang/IllegalArgumentException done
Event: 0.049 Thread 0x00007f5fc00af800 Thread added: 0x00007f5fc00af800
Event: 0.051 Thread 0x00007f5fc00b1800 Thread added: 0x00007f5fc00b1800
Event: 0.052 Thread 0x00007f5fc00b3800 Thread added: 0x00007f5fc00b3800


Dynamic libraries:
00400000-00401000 r-xp 00000000 00:2cc 814709                            /opt/jdk/jdk-11.0.4/bin/java
00600000-00601000 r--p 00000000 00:2cc 814709                            /opt/jdk/jdk-11.0.4/bin/java
00601000-00602000 rw-p 00001000 00:2cc 814709                            /opt/jdk/jdk-11.0.4/bin/java
01d61000-01d82000 rw-p 00000000 00:00 0                                  [heap]
90400000-92950000 rw-p 00000000 00:00 0 
92950000-b5800000 ---p 00000000 00:00 0 
b5800000-ba2b0000 rw-p 00000000 00:00 0 
ba2b0000-100000000 ---p 00000000 00:00 0 
100000000-100060000 rw-p 00000000 00:00 0 
100060000-140000000 ---p 00000000 00:00 0 
7f5f8c000000-7f5f8c021000 rw-p 00000000 00:00 0 
7f5f8c021000-7f5f90000000 ---p 00000000 00:00 0 
7f5f94000000-7f5f94021000 rw-p 00000000 00:00 0 
7f5f94021000-7f5f98000000 ---p 00000000 00:00 0 
7f5f98000000-7f5f98056000 rw-p 00000000 00:00 0 
7f5f98056000-7f5f9c000000 ---p 00000000 00:00 0 
7f5f9c000000-7f5f9c021000 rw-p 00000000 00:00 0 
7f5f9c021000-7f5fa0000000 ---p 00000000 00:00 0 
7f5fa0000000-7f5fa0021000 rw-p 00000000 00:00 0 
7f5fa0021000-7f5fa4000000 ---p 00000000 00:00 0 
7f5fa4000000-7f5fa4021000 rw-p 00000000 00:00 0 
7f5fa4021000-7f5fa8000000 ---p 00000000 00:00 0 
7f5fa8c20000-7f5fa8e90000 rwxp 00000000 00:00 0 
7f5fa8e90000-7f5fa91af000 ---p 00000000 00:00 0 
7f5fa91af000-7f5fa941f000 rwxp 00000000 00:00 0 
7f5fa941f000-7f5fb06e7000 ---p 00000000 00:00 0 
7f5fb06e7000-7f5fb0957000 rwxp 00000000 00:00 0 
7f5fb0957000-7f5fb7c20000 ---p 00000000 00:00 0 
7f5fb7c20000-7f5fc0000000 r--s 00000000 00:2cc 815134                    /opt/jdk/jdk-11.0.4/lib/modules
7f5fc0000000-7f5fc00c5000 rw-p 00000000 00:00 0 
7f5fc00c5000-7f5fc4000000 ---p 00000000 00:00 0 
7f5fc5471000-7f5fc58f2000 rw-p 00000000 00:00 0 
7f5fc58f2000-7f5fc58f6000 ---p 00000000 00:00 0 
7f5fc58f6000-7f5fc59f2000 rw-p 00000000 00:00 0 
7f5fc59f2000-7f5fc59f6000 ---p 00000000 00:00 0 
7f5fc59f6000-7f5fc5af2000 rw-p 00000000 00:00 0 
7f5fc5af2000-7f5fc5af6000 ---p 00000000 00:00 0 
7f5fc5af6000-7f5fc5bf2000 rw-p 00000000 00:00 0 
7f5fc5bf2000-7f5fc5f2c000 r--p 00000000 00:2cc 1060461                   /usr/lib/locale/locale-archive
7f5fc5f2c000-7f5fc5f30000 ---p 00000000 00:00 0 
7f5fc5f30000-7f5fc642c000 rw-p 00000000 00:00 0 
7f5fc642c000-7f5fc682c000 ---p 00000000 00:00 0 
7f5fc682c000-7f5fc6852000 rw-p 00000000 00:00 0 
7f5fc6852000-7f5fc6a81000 ---p 00000000 00:00 0 
7f5fc6a81000-7f5fc6a94000 rw-p 00000000 00:00 0 
7f5fc6a94000-7f5fc6bab000 ---p 00000000 00:00 0 
7f5fc6bab000-7f5fc6bd1000 rw-p 00000000 00:00 0 
7f5fc6bd1000-7f5fc6dff000 ---p 00000000 00:00 0 
7f5fc6dff000-7f5fc6e00000 rw-p 00000000 00:00 0 
7f5fc6e00000-7f5fc6e1b000 r-xp 00000000 00:2cc 815115                    /opt/jdk/jdk-11.0.4/lib/libjimage.so
7f5fc6e1b000-7f5fc701a000 ---p 0001b000 00:2cc 815115                    /opt/jdk/jdk-11.0.4/lib/libjimage.so
7f5fc701a000-7f5fc701c000 r--p 0001a000 00:2cc 815115                    /opt/jdk/jdk-11.0.4/lib/libjimage.so
7f5fc701c000-7f5fc701d000 rw-p 0001c000 00:2cc 815115                    /opt/jdk/jdk-11.0.4/lib/libjimage.so
7f5fc7100000-7f5fc7104000 ---p 00000000 00:00 0 
7f5fc7104000-7f5fc7200000 rw-p 00000000 00:00 0 
7f5fc7200000-7f5fc7207000 r-xp 00000000 00:2cc 815133                    /opt/jdk/jdk-11.0.4/lib/libzip.so
7f5fc7207000-7f5fc7406000 ---p 00007000 00:2cc 815133                    /opt/jdk/jdk-11.0.4/lib/libzip.so
7f5fc7406000-7f5fc7407000 r--p 00006000 00:2cc 815133                    /opt/jdk/jdk-11.0.4/lib/libzip.so
7f5fc7407000-7f5fc7408000 rw-p 00007000 00:2cc 815133                    /opt/jdk/jdk-11.0.4/lib/libzip.so
7f5fc74fe000-7f5fc74ff000 ---p 00000000 00:00 0 
7f5fc74ff000-7f5fc7600000 rw-p 00000000 00:00 0 
7f5fc7600000-7f5fc7629000 r-xp 00000000 00:2cc 815111                    /opt/jdk/jdk-11.0.4/lib/libjava.so
7f5fc7629000-7f5fc7829000 ---p 00029000 00:2cc 815111                    /opt/jdk/jdk-11.0.4/lib/libjava.so
7f5fc7829000-7f5fc782a000 r--p 00029000 00:2cc 815111                    /opt/jdk/jdk-11.0.4/lib/libjava.so
7f5fc782a000-7f5fc782c000 rw-p 0002a000 00:2cc 815111                    /opt/jdk/jdk-11.0.4/lib/libjava.so
7f5fc78fc000-7f5fc7a00000 rw-p 00000000 00:00 0 
7f5fc7a00000-7f5fc7a0d000 r-xp 00000000 00:2cc 815132                    /opt/jdk/jdk-11.0.4/lib/libverify.so
7f5fc7a0d000-7f5fc7c0c000 ---p 0000d000 00:2cc 815132                    /opt/jdk/jdk-11.0.4/lib/libverify.so
7f5fc7c0c000-7f5fc7c0e000 r--p 0000c000 00:2cc 815132                    /opt/jdk/jdk-11.0.4/lib/libverify.so
7f5fc7c0e000-7f5fc7c0f000 rw-p 0000e000 00:2cc 815132                    /opt/jdk/jdk-11.0.4/lib/libverify.so
7f5fc7c2a000-7f5fc7c2f000 rw-p 00000000 00:00 0 
7f5fc7c2f000-7f5fc7d15000 ---p 00000000 00:00 0 
7f5fc7d15000-7f5fc7d1a000 rw-p 00000000 00:00 0 
7f5fc7d1a000-7f5fc7e00000 ---p 00000000 00:00 0 
7f5fc7e00000-7f5fc8f40000 r-xp 00000000 00:2cc 815145                    /opt/jdk/jdk-11.0.4/lib/server/libjvm.so
7f5fc8f40000-7f5fc913f000 ---p 01140000 00:2cc 815145                    /opt/jdk/jdk-11.0.4/lib/server/libjvm.so
7f5fc913f000-7f5fc91fe000 r--p 0113f000 00:2cc 815145                    /opt/jdk/jdk-11.0.4/lib/server/libjvm.so
7f5fc91fe000-7f5fc9237000 rw-p 011fe000 00:2cc 815145                    /opt/jdk/jdk-11.0.4/lib/server/libjvm.so
7f5fc9237000-7f5fc928e000 rw-p 00000000 00:00 0 
7f5fc9296000-7f5fc92d8000 rw-p 00000000 00:00 0 
7f5fc92d8000-7f5fc92dc000 ---p 00000000 00:00 0 
7f5fc92dc000-7f5fc93d8000 rw-p 00000000 00:00 0 
7f5fc93d8000-7f5fc9400000 r--p 00000000 00:2cc 1549522                   /usr/lib/x86_64-linux-gnu/libc.so.6
7f5fc9400000-7f5fc9595000 r-xp 00028000 00:2cc 1549522                   /usr/lib/x86_64-linux-gnu/libc.so.6
7f5fc9595000-7f5fc95ed000 r--p 001bd000 00:2cc 1549522                   /usr/lib/x86_64-linux-gnu/libc.so.6
7f5fc95ed000-7f5fc95f1000 r--p 00214000 00:2cc 1549522                   /usr/lib/x86_64-linux-gnu/libc.so.6
7f5fc95f1000-7f5fc95f3000 rw-p 00218000 00:2cc 1549522                   /usr/lib/x86_64-linux-gnu/libc.so.6
7f5fc95f3000-7f5fc9600000 rw-p 00000000 00:00 0 
7f5fc9600000-7f5fc9610000 r-xp 00000000 00:2cc 815096                    /opt/jdk/jdk-11.0.4/lib/jli/libjli.so
7f5fc9610000-7f5fc980f000 ---p 00010000 00:2cc 815096                    /opt/jdk/jdk-11.0.4/lib/jli/libjli.so
7f5fc980f000-7f5fc9810000 r--p 0000f000 00:2cc 815096                    /opt/jdk/jdk-11.0.4/lib/jli/libjli.so
7f5fc9810000-7f5fc9811000 rw-p 00010000 00:2cc 815096                    /opt/jdk/jdk-11.0.4/lib/jli/libjli.so
7f5fc982b000-7f5fc9830000 rw-p 00000000 00:00 0 
7f5fc9830000-7f5fc9837000 ---p 00000000 00:00 0 
7f5fc9837000-7f5fc9838000 r--p 00000000 00:2cc 1549637                   /usr/lib/x86_64-linux-gnu/librt.so.1
7f5fc9838000-7f5fc9839000 r-xp 00001000 00:2cc 1549637                   /usr/lib/x86_64-linux-gnu/librt.so.1
7f5fc9839000-7f5fc983a000 r--p 00002000 00:2cc 1549637                   /usr/lib/x86_64-linux-gnu/librt.so.1
7f5fc983a000-7f5fc983b000 r--p 00002000 00:2cc 1549637                   /usr/lib/x86_64-linux-gnu/librt.so.1
7f5fc983b000-7f5fc983c000 rw-p 00003000 00:2cc 1549637                   /usr/lib/x86_64-linux-gnu/librt.so.1
7f5fc983c000-7f5fc984a000 r--p 00000000 00:2cc 1549585                   /usr/lib/x86_64-linux-gnu/libm.so.6
7f5fc984a000-7f5fc98c6000 r-xp 0000e000 00:2cc 1549585                   /usr/lib/x86_64-linux-gnu/libm.so.6
7f5fc98c6000-7f5fc9921000 r--p 0008a000 00:2cc 1549585                   /usr/lib/x86_64-linux-gnu/libm.so.6
7f5fc9921000-7f5fc9922000 r--p 000e4000 00:2cc 1549585                   /usr/lib/x86_64-linux-gnu/libm.so.6
7f5fc9922000-7f5fc9923000 rw-p 000e5000 00:2cc 1549585                   /usr/lib/x86_64-linux-gnu/libm.so.6
7f5fc9923000-7f5fc9928000 rw-p 00000000 00:00 0 
7f5fc9928000-7f5fc9929000 r--p 00000000 00:2cc 1549542                   /usr/lib/x86_64-linux-gnu/libdl.so.2
7f5fc9929000-7f5fc992a000 r-xp 00001000 00:2cc 1549542                   /usr/lib/x86_64-linux-gnu/libdl.so.2
7f5fc992a000-7f5fc992b000 r--p 00002000 00:2cc 1549542                   /usr/lib/x86_64-linux-gnu/libdl.so.2
7f5fc992b000-7f5fc992c000 r--p 00002000 00:2cc 1549542                   /usr/lib/x86_64-linux-gnu/libdl.so.2
7f5fc992c000-7f5fc992d000 rw-p 00003000 00:2cc 1549542                   /usr/lib/x86_64-linux-gnu/libdl.so.2
7f5fc992d000-7f5fc992e000 r--p 00000000 00:2cc 1549635                   /usr/lib/x86_64-linux-gnu/libpthread.so.0
7f5fc992e000-7f5fc992f000 r-xp 00001000 00:2cc 1549635                   /usr/lib/x86_64-linux-gnu/libpthread.so.0
7f5fc992f000-7f5fc9930000 r--p 00002000 00:2cc 1549635                   /usr/lib/x86_64-linux-gnu/libpthread.so.0
7f5fc9930000-7f5fc9931000 r--p 00002000 00:2cc 1549635                   /usr/lib/x86_64-linux-gnu/libpthread.so.0
7f5fc9931000-7f5fc9932000 rw-p 00003000 00:2cc 1549635                   /usr/lib/x86_64-linux-gnu/libpthread.so.0
7f5fc9932000-7f5fc9934000 r--p 00000000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc9934000-7f5fc9945000 r-xp 00002000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc9945000-7f5fc994b000 r--p 00013000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc994b000-7f5fc994c000 ---p 00019000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc994c000-7f5fc994d000 r--p 00019000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc994d000-7f5fc994e000 rw-p 0001a000 00:2cc 1549679                   /usr/lib/x86_64-linux-gnu/libz.so.1.2.11
7f5fc9950000-7f5fc9958000 rw-s 00000000 00:2d4 17                        /tmp/hsperfdata_runner26/15194
7f5fc9958000-7f5fc9959000 ---p 00000000 00:00 0 
7f5fc9959000-7f5fc995a000 r--p 00000000 00:00 0 
7f5fc995a000-7f5fc995c000 rw-p 00000000 00:00 0 
7f5fc995c000-7f5fc995e000 r--p 00000000 00:2cc 1549504                   /usr/lib/x86_64-linux-gnu/ld-linux-x86-64.so.2
7f5fc995e000-7f5fc9988000 r-xp 00002000 00:2cc 1549504                   /usr/lib/x86_64-linux-gnu/ld-linux-x86-64.so.2
7f5fc9988000-7f5fc9993000 r--p 0002c000 00:2cc 1549504                   /usr/lib/x86_64-linux-gnu/ld-linux-x86-64.so.2
7f5fc9994000-7f5fc9996000 r--p 00037000 00:2cc 1549504                   /usr/lib/x86_64-linux-gnu/ld-linux-x86-64.so.2
7f5fc9996000-7f5fc9998000 rw-p 00039000 00:2cc 1549504                   /usr/lib/x86_64-linux-gnu/ld-linux-x86-64.so.2
7ffed5f5f000-7ffed5f80000 rw-p 00000000 00:00 0                          [stack]
7ffed5f90000-7ffed5f93000 r--p 00000000 00:00 0                          [vvar]
7ffed5f93000-7ffed5f95000 r-xp 00000000 00:00 0                          [vdso]
ffffffffff600000-ffffffffff601000 --xp 00000000 00:00 0                  [vsyscall]


VM Arguments:
java_command: Main
java_class_path (initial): .
Launcher Type: SUN_STANDARD

[Global flags]
     intx CICompilerCount                          = 2                                         {product} {ergonomic}
   size_t InitialHeapSize                          = 117440512                                 {product} {ergonomic}
   size_t MaxHeapSize                              = 1874853888                                {product} {ergonomic}
   size_t MaxNewSize                               = 624951296                                 {product} {ergonomic}
   size_t MinHeapDeltaBytes                        = 196608                                    {product} {ergonomic}
   size_t NewSize                                  = 39124992                                  {product} {ergonomic}
    uintx NonNMethodCodeHeapSize                   = 5824844                                {pd product} {ergonomic}
    uintx NonProfiledCodeHeapSize                  = 122916698                              {pd product} {ergonomic}
   size_t OldSize                                  = 78315520                                  {product} {ergonomic}
    uintx ProfiledCodeHeapSize                     = 122916698                              {pd product} {ergonomic}
    uintx ReservedCodeCacheSize                    = 251658240                              {pd product} {ergonomic}
     bool SegmentedCodeCache                       = true                                      {product} {ergonomic}
     bool UseCompressedClassPointers               = true                                 {lp64_product} {ergonomic}
     bool UseCompressedOops                        = true                                 {lp64_product} {ergonomic}
     bool UseSerialGC                              = true                                      {product} {ergonomic}

Logging:
Log output configuration:
 #0: stdout all=warning uptime,level,tags
 #1: stderr all=off uptime,level,tags

Environment Variables:
JAVA_HOME=/opt/jdk/jdk-11.0.4
PATH=/opt/jdk/jdk-11.0.4/bin/:/bin:/usr/bin
DISPLAY=:1

Signal Handlers:
SIGSEGV: [libjvm.so+0xe2b860], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGBUS: [libjvm.so+0xe2b860], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGFPE: [libjvm.so+0xe2b860], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGPIPE: [libjvm.so+0xbffef0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGXFSZ: [libjvm.so+0xbffef0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGILL: [libjvm.so+0xe2b860], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGUSR2: [libjvm.so+0xbffd90], sa_mask[0]=00000000000000000000000000000000, sa_flags=SA_RESTART|SA_SIGINFO
SIGHUP: [libjvm.so+0xc000f0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGINT: [libjvm.so+0xc000f0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGTERM: [libjvm.so+0xc000f0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO
SIGQUIT: [libjvm.so+0xc000f0], sa_mask[0]=11111111011111111101111111111110, sa_flags=SA_RESTART|SA_SIGINFO


---------------  S Y S T E M  ---------------

OS:DISTRIB_ID=Ubuntu
DISTRIB_RELEASE=22.04
DISTRIB_CODENAME=jammy
DISTRIB_DESCRIPTION="Ubuntu 22.04.1 LTS"
uname:Linux 5.4.0-1093-gcp #102~18.04.1-Ubuntu SMP Sat Oct 29 06:35:49 UTC 2022 x86_64
libc:glibc 2.35 NPTL 2.35 
rlimit: STACK 8192k, CORE 0k, NPROC 100, NOFILE 175, AS infinity, DATA infinity, FSIZE 51200k
load average:4.39 3.79 2.72

/proc/meminfo:
MemTotal:        7320904 kB
MemFree:         2418936 kB
MemAvailable:    4614536 kB
Buffers:          115516 kB
Cached:          1798396 kB
SwapCached:            0 kB
Active:          2241924 kB
Inactive:         935512 kB
Active(anon):    1197024 kB
Inactive(anon):    33336 kB
Active(file):    1044900 kB
Inactive(file):   902176 kB
Unevictable:           0 kB
Mlocked:               0 kB
SwapTotal:             0 kB
SwapFree:              0 kB
Dirty:              2580 kB
Writeback:            12 kB
AnonPages:       1261640 kB
Mapped:           337668 kB
Shmem:             46516 kB
KReclaimable:     551192 kB
Slab:            1534680 kB
SReclaimable:     551192 kB
SUnreclaim:       983488 kB
KernelStack:       33920 kB
PageTables:        26000 kB
NFS_Unstable:          0 kB
Bounce:                0 kB
WritebackTmp:          0 kB
CommitLimit:     3660452 kB
Committed_AS:   15655944 kB
VmallocTotal:   34359738367 kB
VmallocUsed:       48188 kB
VmallocChunk:          0 kB
Percpu:            13120 kB
HardwareCorrupted:     0 kB
AnonHugePages:     14336 kB
ShmemHugePages:        0 kB
ShmemPmdMapped:        0 kB
FileHugePages:         0 kB
FilePmdMapped:         0 kB
CmaTotal:              0 kB
CmaFree:               0 kB
HugePages_Total:       0
HugePages_Free:        0
HugePages_Rsvd:        0
HugePages_Surp:        0
Hugepagesize:       2048 kB
Hugetlb:               0 kB
DirectMap4k:     1094644 kB
DirectMap2M:     6455296 kB
DirectMap1G:     1048576 kB


/proc/sys/kernel/threads-max (system-wide limit on the number of threads):
56842


/proc/sys/vm/max_map_count (maximum number of memory map areas a process may have):
65530


/proc/sys/kernel/pid_max (system-wide limit on number of process identifiers):
32768



container (cgroup) information:
container_type: cgroupv1
cpu_cpuset_cpus: 0-7
cpu_memory_nodes: 0
active_processor_count: 1
cpu_quota: 100000
cpu_period: 100000
cpu_shares: -1
memory_limit_in_bytes: -1
memory_and_swap_limit_in_bytes: -2
memory_soft_limit_in_bytes: -1
memory_usage_in_bytes: 27209728
memory_max_usage_in_bytes: 425164800


CPU:total 8 (initial active 1) (4 cores per cpu, 2 threads per core) family 6 model 85 stepping 3, cmov, cx8, fxsr, mmx, sse, sse2, sse3, ssse3, sse4.1, sse4.2, popcnt, avx, avx2, aes, clmul, erms, rtm, 3dnowpref, lzcnt, ht, tsc, tscinvbit, bmi1, bmi2, adx, evex, fma
CPU Model and flags from /proc/cpuinfo:
model name	: Intel(R) Xeon(R) CPU @ 2.00GHz
flags		: fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology nonstop_tsc cpuid tsc_known_freq pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm abm 3dnowprefetch invpcid_single pti ssbd ibrs ibpb stibp fsgsbase tsc_adjust bmi1 hle avx2 smep bmi2 erms invpcid rtm mpx avx512f avx512dq rdseed adx smap clflushopt clwb avx512cd avx512bw avx512vl xsaveopt xsavec xgetbv1 xsaves arat md_clear arch_capabilities

Memory: 4k page, physical 7320904k(2418936k free), swap 0k(0k free)

vm_info: Java HotSpot(TM) 64-Bit Server VM (11.0.4+10-LTS) for linux-amd64 JRE (11.0.4+10-LTS), built on Jul  4 2019 15:26:10 by "mach5one" with gcc 7.3.0

END.
