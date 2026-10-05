package it.curati.cmail.core.templates

/**
 * C Mail templates are server-first. Aruba templates are read from the
 * account's IMAP "Modelli" folder so they remain interoperable with webmail.
 */
data class TemplateSource(
    val accountUuid: String,
    val folderName: String = "Modelli",
)
