# ProtoVault (Fork Vault) — Библиотека абстракций для Bukkit

## Для разработчиков:
Смотри страницу [VaultAPI](https://www.github.com/MilkBowl/VaultAPI) для получения информации о разработке с использованием API Vault. Раньше использовался тот же артефакт, что и на серверах, но теперь API вынесен в отдельный проект с другим именем артефакта. Убедись, что учёл это изменение в своей системе сборки.

## Установка
Установка Vault проста: просто скопируй предоставленный `Vault.jar` в папку `<bukkit-install-dir>/plugins`, и всё произойдёт автоматически! При необходимости изменения конфигурации это можно сделать через конфигурационный файл, но обычно это не требуется. См. раздел "Расширенная конфигурация" для подробностей.

## Почему Vault?
Мне не важно, какая библиотека тебе больше подходит. Я посчитал, что лучше создать централизованный набор решений (Vault), чем фокусироваться на одном типе плагинов. Так появилась идея Vault.

Какие функции, по моему мнению, тебе понравятся больше всего?

* **Не нужно включать исходный код Vault в свой плагин**  
  Vault работает как отдельный плагин, тебе нужно лишь получить его экземпляр! Это решает проблемы с конфликтами имён между плагинами. Просто добавь `Vault.jar` в архив своего плагина!

* **Широкий список поддерживаемых плагинов**  
  Я хотел сделать слой абстракции не только для экономики, но и для прав доступа.

* **Выбор!**  
  Bukkit — это свобода выбора. А значит — больше вариантов, больше гибкости.

## Права доступа
* `vault.admin` — даёт игроку право получать уведомления об обновлениях

## Лицензия
Copyright (C) 2011–2018 Morgan Humes <morgan@lanaddict.com>

Vault — это свободное ПО: ты можешь распространять и/или модифицировать его согласно условиям GNU Lesser General Public License версии 3 или более поздней.

Vault распространяется с надеждой, что он будет полезен, но БЕЗ КАКИХ-ЛИБО ГАРАНТИЙ, включая подразумеваемые гарантии ПРИГОДНОСТИ ДЛЯ КОНКРЕТНЫХ ЦЕЛЕЙ. Подробности см. в GNU LGPL.

Ты должен был получить копию GNU LGPL вместе с Vault. Если нет — смотри <http://www.gnu.org/licenses/>.

## Сборка
Vault содержит все нужные библиотеки для сборки текущей ветки и файлы сборки Apache Ant (`build.xml`) и Maven (`pom.xml`). Maven — предпочтительный способ сборки.

## Зависимости
Поскольку Vault является мостом между плагинами, для сборки могут потребоваться бинарники сторонних плагинов. Чтобы упростить это, они включены в папку `lib`. Для разработки с Vault тебе не нужно использовать эти библиотеки — достаточно скомпилироваться с Vault.

## Поддерживаемые плагины

### Permissions:
- bPermissions
- bPermissions 2 — https://dev.bukkit.org/projects/bpermissions
- DroxPerms
- Group Manager (Essentials) — https://forums.bukkit.org/threads/15312/
- LuckPerms — https://www.spigotmc.org/resources/luckperms-an-advanced-permissions-plugin.28140/
- OverPermissions — https://dev.bukkit.org/projects/overpermissions
- Permissions 3 — https://forums.bukkit.org/threads/18430/
- PermissionsBukkit
- PermissionsEx (PEX) — https://forums.bukkit.org/threads/18140/
- Privileges
- rscPermissions
- SimplyPerms
- SuperPerms (по умолчанию в Bukkit)
- TotalPermissions — https://dev.bukkit.org/projects/totalpermissions
- XPerms
- zPermissions

### Chat:
- bPermissions
- Group Manager (Essentials) — https://forums.bukkit.org/threads/15312/
- iChat
- LuckPerms — https://www.spigotmc.org/resources/luckperms-an-advanced-permissions-plugin.28140/
- mChat
- mChatSuite
- OverPermissions — https://dev.bukkit.org/projects/overpermissions
- Permissions 3 — https://forums.bukkit.org/threads/18430/
- PermissionsEx (PEX) — https://forums.bukkit.org/threads/18140/
- rscPermissions
- TotalPermissions — https://dev.bukkit.org/projects/totalpermissions
- zPermissions