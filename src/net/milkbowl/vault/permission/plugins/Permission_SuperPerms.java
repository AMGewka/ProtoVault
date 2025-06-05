/* Этот файл является частью Vault.

    Vault — это свободное программное обеспечение: вы можете распространять его и/или изменять
    на условиях Стандартной Общественной Лицензии GNU Lesser, опубликованной
    Фондом Свободного Программного Обеспечения, либо версии 3 лицензии, либо
    (на ваш выбор) любой более поздней версии.

    Vault распространяется в надежде, что он будет полезен,
    но БЕЗ КАКИХ-ЛИБО ГАРАНТИЙ; даже без подразумеваемой гарантии
    КОММЕРЧЕСКОЙ ПРИГОДНОСТИ или ПРИГОДНОСТИ ДЛЯ ОПРЕДЕЛЁННОЙ ЦЕЛИ. Подробнее см. в
    Стандартной Общественной Лицензии GNU Lesser.

    Вы должны были получить копию Стандартной Общественной Лицензии GNU Lesser
    вместе с Vault. Если нет, см. <http://www.gnu.org/licenses/>.
 */
package net.milkbowl.vault.permission.plugins;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Permission_SuperPerms extends Permission {

	private final String name = "SuperPerms";

	public Permission_SuperPerms(Plugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean playerHas(String world, String player, String permission) {
		Player p = plugin.getServer().getPlayer(player);
		return p != null ? p.hasPermission(permission) : false;
	}

	@Override
	public boolean playerAdd(String world, String player, String permission) {
		return false;
	}

	// используется реализация по умолчанию playerAddTransient() и playerRemoveTransient()

	@Override
	public boolean playerRemove(String world, String player, String permission) {
		return false;
	}

	@Override
	public boolean groupHas(String world, String group, String permission) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public boolean groupAdd(String world, String group, String permission) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public boolean groupRemove(String world, String group, String permission) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public boolean playerInGroup(String world, String player, String group) {
		return playerHas(world, player, "groups." + group);
	}

	@Override
	public boolean playerAddGroup(String world, String player, String group) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public boolean playerRemoveGroup(String world, String player, String group) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public String[] getPlayerGroups(String world, String player) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public String getPrimaryGroup(String world, String player) {
		throw new UnsupportedOperationException(getName() + " не поддерживает групповые права.");
	}

	@Override
	public String[] getGroups() {
		return new String[0];
	}

	@Override
	public boolean hasSuperPermsCompat() {
		return true;
	}

	@Override
	public boolean hasGroupSupport() {
		return false;
	}
}
