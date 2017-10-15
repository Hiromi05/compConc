#!/usr/bin/perl

print (`javac -encoding UTF-8 Sistema.java`);
print (`java Sistema $ARGV[0] $ARGV[1]`);
