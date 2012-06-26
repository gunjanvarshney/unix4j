package org.unix4j.builder;

import org.unix4j.command.unix.Cut;
import org.unix4j.command.unix.Echo;
import org.unix4j.command.unix.Grep;
import org.unix4j.command.unix.Ls;
import org.unix4j.command.unix.Sed;
import org.unix4j.command.unix.Sort;
import org.unix4j.command.unix.Xargs;

public interface Unix4jCommandBuilder extends CommandBuilder, Ls.Interface<Unix4jCommandBuilder>, Grep.Interface<Unix4jCommandBuilder>, Echo.Interface<Unix4jCommandBuilder>, Sort.Interface<Unix4jCommandBuilder>, Cut.Interface<Unix4jCommandBuilder>, Sed.Interface<Unix4jCommandBuilder>, Xargs.Interface<Unix4jCommandBuilder> {
}
